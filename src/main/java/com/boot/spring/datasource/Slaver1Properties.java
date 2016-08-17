/**
 * @Title Slaver1Properties.java
 * @Package com.boot.spring.datasource
 * @Description TODO
 * Copyright: Copyright (c) 2016 
 * Company:*******
 * 
 * @author 徐故成
 * @date 2016-8-17 上午11:11:39
 * @version V1.0
 */
package com.boot.spring.datasource;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * @ClassName Slaver1Properties
 * @Description TODO
 * 
 */
@ConfigurationProperties(prefix = "spring.datasource.slaver1")
public class Slaver1Properties extends SlaverProperties {
}
