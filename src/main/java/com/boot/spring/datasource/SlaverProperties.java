/**
 * @Title SlaverProperties.java
 * @Package com.boot.spring.datasource
 * @Description TODO
 * Copyright: Copyright (c) 2016 
 * Company:*******
 * 
 * @author 徐故成
 * @date 2016-8-17 上午11:13:30
 * @version V1.0
 */
package com.boot.spring.datasource;

/**
 * @ClassName SlaverProperties
 * @Description TODO
 * 
 */
public class SlaverProperties {
	private String name;
	private String type;
	private String driverClassName;
	private String url;
	private String username;
	private String password;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getDriverClassName() {
		return driverClassName;
	}
	public void setDriverClassName(String driverClassName) {
		this.driverClassName = driverClassName;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
}
