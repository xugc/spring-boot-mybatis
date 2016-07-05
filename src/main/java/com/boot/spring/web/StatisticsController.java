/**   
 * @Title: StatisticsController.java 
 * @Package com.boot.spring.web 
 * @Description: TODO(用一句话描述该文件做什么) 
 * @author xugucheng guchengxu1988@163.com   
 * @date 2016-7-5 下午9:28:51 
 * @version V1.0   
 */
package com.boot.spring.web;

import javax.servlet.http.HttpSession;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @ClassName: StatisticsController
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author xugucheng guchengxu1988@163.com
 * @date 2016-7-5 下午9:28:51
 * 
 */
@Controller
@EnableAutoConfiguration
@RequestMapping("/statistics")
public class StatisticsController {
	@RequestMapping("/productHotMap")
	public String toProductHotMap(HttpSession session, Model model) {
		return "product_hot_map";
	}
}
