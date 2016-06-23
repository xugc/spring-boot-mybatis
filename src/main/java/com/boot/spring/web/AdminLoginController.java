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

import java.util.UUID;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.web.filter.authc.FormAuthenticationFilter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.boot.spring.domain.User;
import com.boot.spring.domain.vo.UserLoginInfoVo;
import com.boot.spring.service.UserService;

/**
 * @ClassName AdminLoginController
 * @Description TODO
 * 
 */
@Controller
@EnableAutoConfiguration
@RequestMapping("/admin")
public class AdminLoginController {

	@Autowired
	private UserService userService;

	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public String toLogin(Model model, HttpSession session) {
		String valcodeuuid = UUID.randomUUID().toString();
		model.addAttribute("valcodeuuid", valcodeuuid);
		return "admin_login";
	}

	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public String login(String userName, String userPwd, String validateNumber,
			HttpServletRequest request, HttpSession session, Model model,
			RedirectAttributes attr) {
		Object error = request
				.getAttribute(FormAuthenticationFilter.DEFAULT_ERROR_KEY_ATTRIBUTE_NAME);
		if (error instanceof AuthenticationException) {
			AuthenticationException auError = (AuthenticationException) error;
			UserLoginInfoVo userInfo = new UserLoginInfoVo();
			userInfo.setMsg(auError.getMessage());
			userInfo.setUserName(userName);
			attr.addFlashAttribute("info", userInfo);
			return "redirect:/admin/login";
		}
		return "redirect:/admin/success";
	}

	@RequestMapping("/success")
	public String toDefault(HttpSession session, Model model) {
		String loginUser = (String) session.getAttribute("userName");
		User user = userService.getUserByUserName(loginUser);
		UserLoginInfoVo userInfo = new UserLoginInfoVo();
		userInfo.setUserName(user.getUserName());
		userInfo.setEmail(user.getEmail());
		model.addAttribute("user", userInfo);
		return "admin_default";
	}

	@RequestMapping("/main")
	public String toMain() {
		return "admin_main";
	}

}
