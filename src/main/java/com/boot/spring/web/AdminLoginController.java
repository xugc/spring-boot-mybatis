/**
 * @Title AdminLoginController.java
 * @Package com.boot.spring.web
 * @Description TODO
 * Copyright: Copyright (c) 2016 
 * Company:*******
 * 
 * @author 徐故成
 * @date 2016-6-8 下午2:55:11
 * @version V1.0
 */
package com.boot.spring.web;

import javax.servlet.http.HttpSession;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.boot.spring.domain.vo.UserLoginInfoVo;
import com.google.code.kaptcha.Constants;

/**
 * @ClassName AdminLoginController
 * @Description TODO
 * 
 */
@Controller
@EnableAutoConfiguration
@RequestMapping("/admin")
public class AdminLoginController {
	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public String toLogin() {
		return "admin_login";
	}

	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public String login(String userName, String userPwd, String validateNumber,
			HttpSession session, Model model) {
		String valNumber = (String) session
				.getAttribute(Constants.KAPTCHA_SESSION_KEY);
		if (!valNumber.equals(validateNumber)) {
			UserLoginInfoVo userInfo = new UserLoginInfoVo();
			userInfo.setMsg("验证码错误");
			userInfo.setValidateNumber(valNumber);
			userInfo.setUserName(userName);
			model.addAttribute("info", userInfo);
			return "admin_login";
		}
		return "admin_default";
	}

	@RequestMapping("/success")
	public String toDefault() {
		return "admin_default";
	}

}
