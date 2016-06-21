/**
 * @Title ErrorController.java
 * @Package com.boot.spring.web
 * @Description TODO
 * Copyright: Copyright (c) 2016 
 * Company:*******
 * 
 * @author 徐故成
 * @date 2016-6-21 上午11:44:07
 * @version V1.0
 */
package com.boot.spring.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @ClassName ErrorController
 * @Description TODO
 * 
 */
@Controller
public class ErrorController implements
		org.springframework.boot.autoconfigure.web.ErrorController {
	private static final String ERROR_PATH = "error";

	@Override
	public String getErrorPath() {
		return ERROR_PATH;
	}

	@RequestMapping("/error")
	@ResponseBody
	public String error() {
		return "服务器错误";
	}

}
