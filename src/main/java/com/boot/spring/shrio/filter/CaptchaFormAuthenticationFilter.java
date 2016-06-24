package com.boot.spring.shrio.filter;

import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.crypto.hash.Md5Hash;
import org.apache.shiro.session.Session;
import org.apache.shiro.subject.Subject;
import org.apache.shiro.web.filter.authc.FormAuthenticationFilter;
import org.apache.shiro.web.util.WebUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.boot.spring.exception.FailLoginException;
import com.boot.spring.shrio.validatecode.CaptchaUsernamePasswordToken;
import com.google.code.kaptcha.Constants;

public class CaptchaFormAuthenticationFilter extends FormAuthenticationFilter {
	private static final Logger LOG = LoggerFactory
			.getLogger(CaptchaFormAuthenticationFilter.class);

	public static final String DEFAULT_LOGIN_PROCESS_URL = "login";
	public String loginProcessUrl = DEFAULT_LOGIN_PROCESS_URL;

	public CaptchaFormAuthenticationFilter() {
	}

	public String getLoginProcessUrl() {
		return loginProcessUrl;
	}

	public void setLoginProcessUrl(String loginProcessUrl) {
		this.loginProcessUrl = loginProcessUrl;
	}

	public static final String DEFAULT_CSRF_UUID_PARAM = "csrf_id";
	private String csrfUuidParam = DEFAULT_CSRF_UUID_PARAM;

	public String getCsrfUuidParam() {
		return csrfUuidParam;
	}

	public void setCsrfUuidParam(String csrfUuidParam) {
		this.csrfUuidParam = csrfUuidParam;
	}

	protected String getCsrfUuid(ServletRequest request) {
		return WebUtils.getCleanParam(request, getCsrfUuidParam());
	}

	/**
	 * 加入随机数校验,防止csrf攻击
	 */
	@Override
	protected boolean isAccessAllowed(ServletRequest request,
			ServletResponse response, Object mappedValue) {
		if(!isLoginRequest(request, response)){
			return super.isAccessAllowed(request, response, mappedValue);
		}
		Session session=getSubject(request, response).getSession(true);
		Object ppid = session.getAttribute(getCsrfUuidParam());
		session.removeAttribute(getCsrfUuidParam());
		String clientPpid = getCsrfUuid(request);
		if (ppid == null || clientPpid == null)
			return false;
		return super.isAccessAllowed(request, response, mappedValue)
				&& clientPpid.trim().equals(ppid.toString());
	}

	@Override
	protected boolean isLoginRequest(ServletRequest request,
			ServletResponse response) {
		return pathsMatch(getLoginProcessUrl(), request)
				|| super.isLoginRequest(request, response);
	}

	/**
	 * 登录验证
	 */
	@Override
	protected boolean executeLogin(ServletRequest request,
			ServletResponse response) throws Exception {
		CaptchaUsernamePasswordToken token = null;
		try {
			try {
				token = createToken(request, response);
				/* 图形验证码验证 */
				doCaptchaValidate((HttpServletRequest) request, token);
			} catch (AuthenticationException e) {
				LOG.info(token != null ? token.getUsername() : "" + "登录失败--"
						+ e);
				return onLoginFailure(token, e, request, response);
			}
			Subject subject = getSubject(request, response);
			subject.login(token);// 正常验证
			subject.getSession(true).setAttribute("userName",
					token.getUsername());// shrio session管理
			LOG.info(token.getUsername() + "登录成功");
			return onLoginSuccess(token, subject, request, response);
		} catch (AuthenticationException e) {
			LOG.info(token.getUsername() + "登录失败--" + e);
			return onLoginFailure(token, new FailLoginException("用户名或密码错误！"),
					request, response);
		}
	}

	// 验证码校验
	protected void doCaptchaValidate(HttpServletRequest request,
			CaptchaUsernamePasswordToken token) throws AuthenticationException {
		String cid = getCaptchaId(request);
		// session中的图形码字符串
		String captcha = (String) request.getSession().getAttribute(cid);
		request.getSession().removeAttribute(cid);// 使用完立马删除
		// 比对
		if (captcha != null && !captcha.equalsIgnoreCase(token.getCaptcha())) {
			throw new FailLoginException("验证码错误！");
		}
	}

	@Override
	protected CaptchaUsernamePasswordToken createToken(ServletRequest request,
			ServletResponse response) {
		String username = getUsername(request);
		if (username == null || username.trim().equals("")) {
			throw new FailLoginException("用户名不能为空！");
		}
		String password = getPassword(request);
		String captcha = getCaptcha(request);
		boolean rememberMe = isRememberMe(request);
		String host = getHost(request);

		return new CaptchaUsernamePasswordToken(username,
				password == null ? "".toCharArray() : new Md5Hash(password, "",
						4).toBase64().toCharArray(), rememberMe, host, captcha);
	}

	public static final String DEFAULT_CAPTCHA_PARAM = "captcha";

	private String captchaParam = DEFAULT_CAPTCHA_PARAM;

	public String getCaptchaParam() {
		return captchaParam;
	}

	public void setCaptchaParam(String captchaParam) {
		this.captchaParam = captchaParam;
	}

	protected String getCaptcha(ServletRequest request) {
		return WebUtils.getCleanParam(request, getCaptchaParam());
	}

	public static final String DEFAULT_CAPTCHA_ID_PARAM = Constants.KAPTCHA_SESSION_KEY;

	private String captchaIdParam = DEFAULT_CAPTCHA_ID_PARAM;

	public String getCaptchaIdParam() {
		return captchaIdParam;
	}

	public void setCaptchaIdParam(String captchaIdParam) {
		this.captchaIdParam = captchaIdParam;
	}

	protected String getCaptchaId(ServletRequest request) {
		return WebUtils.getCleanParam(request, getCaptchaIdParam());
	}

	// 保存异常对象到request
	@Override
	protected void setFailureAttribute(ServletRequest request,
			AuthenticationException ae) {
		request.setAttribute(getFailureKeyAttribute(), ae);
	}
}