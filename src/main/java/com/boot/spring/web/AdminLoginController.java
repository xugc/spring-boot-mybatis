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

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @ClassName AdminLoginController
 * @Description TODO
 * 
 */
@Controller
@EnableAutoConfiguration
@RequestMapping("/admin")
public class AdminLoginController {
	@RequestMapping("/login")
	public String toLogin() {
		return "admin_login";
	}
	
	@RequestMapping("/submit")
	public String login() {
		return "admin_default";
	}
	
}
