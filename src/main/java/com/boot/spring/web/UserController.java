/**
 * @Title: UserController.java
 * @Package com.boot.spring.web
 * @Description: TODO
 * Copyright: Copyright (c) 2016 
 * Company:*******
 * 
 * @author 徐故成
 * @date 2016-5-11 上午9:50:39
 * @version V1.0
 */
package com.boot.spring.web;

import java.util.Date;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.boot.spring.domain.User;
import com.boot.spring.service.UserService;

/**
 * @ClassName: UserController
 * @Description: TODO
 * 
 */
@Controller
@EnableAutoConfiguration
@RequestMapping("/user")
public class UserController {
	@Autowired
	UserService userService;
	@Value("${application.message:Hello World}")
	private String message = "Hello World";

	@RequestMapping("/hello")
	@ResponseBody
	public String helloWorld() {
		User user = new User();
		user.setUserName("xgc2");
		user.setLoginName("abc2");
		userService.addUser(user);
		return "Hello World";
	}
	
	@RequestMapping("/hello/error")
	@ResponseBody
	public String helloWorldError() {
		User user = new User();
		user.setUserName("xgc3");
		user.setLoginName("abc3");
		try {
			userService.addUserError(user);
		} catch (Exception e) {
		}
		return "Hello World";
	}

	@RequestMapping("/welcome")
	public String welcome(Map<String, Object> model) {
		model.put("time", new Date());
		model.put("message", this.message);
		return "welcome";
	}

	@RequestMapping("/foo")
	public String foo(Map<String, Object> model) {
		throw new RuntimeException("Foo");
	}
}
