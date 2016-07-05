/**
 * @Title HomePageController.java
 * @Package com.boot.spring.web
 * @Description TODO
 * Copyright: Copyright (c) 2016 
 * Company:*******
 * 
 * @author 徐故成
 * @date 2016-6-29 上午11:47:16
 * @version V1.0
 */
package com.boot.spring.web;

import javax.servlet.http.HttpSession;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @ClassName HomePageController
 * @Description TODO
 * 
 */
@Controller
@EnableAutoConfiguration
@RequestMapping("/homePage")
public class HomePageController {

	@RequestMapping("/toAdvertisement")
	public String toAdvertisementList(HttpSession session, Model model) {
		return "admin_advertisement_list";
	}
	@RequestMapping("/toAdvertisementAdd")
	public String toAdvertisementAdd(HttpSession session, Model model) {
		return "admin_advertisement_add";
	}
}
