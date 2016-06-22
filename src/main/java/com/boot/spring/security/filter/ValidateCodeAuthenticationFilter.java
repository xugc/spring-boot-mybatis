//package com.boot.spring.security.filter;
//
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//
//import org.springframework.security.authentication.AuthenticationServiceException;
//import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
//import org.springframework.security.core.Authentication;
//import org.springframework.security.core.AuthenticationException;
//import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;
//
//import com.google.code.kaptcha.Constants;
//
//public class ValidateCodeAuthenticationFilter extends
//		UsernamePasswordAuthenticationFilter {
//
//	private boolean postOnly = true;
//	private boolean allowEmptyValidateCode = false;
//	private String sessionvalidateCodeField = DEFAULT_SESSION_VALIDATE_CODE_FIELD;
//	private String validateCodeParameter = DEFAULT_VALIDATE_CODE_PARAMETER;
//	public static final String DEFAULT_SESSION_VALIDATE_CODE_FIELD = Constants.KAPTCHA_SESSION_KEY;
//	public static final String DEFAULT_VALIDATE_CODE_PARAMETER = "validateNumber";
//	public static final String VALIDATE_CODE_FAILED_MSG_KEY = "validateNumber.notEquals";
//
//	@Override
//	public Authentication attemptAuthentication(HttpServletRequest request,
//			HttpServletResponse response) throws AuthenticationException {
//		if (postOnly && !request.getMethod().equals("POST")) {
//			throw new AuthenticationServiceException(
//					"Authentication method not supported: "
//							+ request.getMethod());
//		}
//
//		String username = obtainUsername(request);
//		String password = obtainPassword(request);
//
//		if (username == null) {
//			username = "";
//		}
//
//		if (password == null) {
//			password = "";
//		}
//
//		username = username.trim();
//
//		UsernamePasswordAuthenticationToken authRequest = new UsernamePasswordAuthenticationToken(
//				username, password);
//
//		// Allow subclasses to set the "details" property
//		setDetails(request, authRequest);
//
//		// check validate code
//		if (!isAllowEmptyValidateCode())
//			checkValidateCode(request);
//		return this.getAuthenticationManager().authenticate(authRequest);
//	}
//
//	/**
//	 * 
//	 * <li>比较session中的验证码和用户输入的验证码是否相等</li>
//	 * 
//	 */
//	protected void checkValidateCode(HttpServletRequest request) {
//		String sessionValidateCode = obtainSessionValidateCode(request);
//		String validateCodeParameter = obtainValidateCodeParameter(request);
//		if (validateCodeParameter.trim().equals("")
//				|| !sessionValidateCode.equalsIgnoreCase(validateCodeParameter)) {
//			throw new AuthenticationServiceException(
//					messages.getMessage(VALIDATE_CODE_FAILED_MSG_KEY));
//		}
//	}
//
//	private String obtainValidateCodeParameter(HttpServletRequest request) {
//		return request.getParameter(validateCodeParameter);
//	}
//
//	protected String obtainSessionValidateCode(HttpServletRequest request) {
//		Object obj = request.getSession()
//				.getAttribute(sessionvalidateCodeField);
//		return null == obj ? "" : obj.toString();
//	}
//
//	public boolean isPostOnly() {
//		return postOnly;
//	}
//
//	@Override
//	public void setPostOnly(boolean postOnly) {
//		this.postOnly = postOnly;
//	}
//
//	public String getValidateCodeName() {
//		return sessionvalidateCodeField;
//	}
//
//	public void setValidateCodeName(String validateCodeName) {
//		this.sessionvalidateCodeField = validateCodeName;
//	}
//
//	public boolean isAllowEmptyValidateCode() {
//		return allowEmptyValidateCode;
//	}
//
//	public void setAllowEmptyValidateCode(boolean allowEmptyValidateCode) {
//		this.allowEmptyValidateCode = allowEmptyValidateCode;
//	}
//
//}