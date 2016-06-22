/**
 * @Title UserLoginInfoVo.java
 * @Package com.boot.spring.domain.vo
 * @Description TODO
 * Copyright: Copyright (c) 2016 
 * Company:*******
 * 
 * @author 徐故成
 * @date 2016-6-21 下午5:24:50
 * @version V1.0
 */
package com.boot.spring.domain.vo;


/**  
 * @ClassName UserLoginInfoVo  
 * @Description TODO  
 *    
 */
public class UserLoginInfoVo {
	
	private String userName;
	private String validateNumber;
	private String msg;
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getValidateNumber() {
		return validateNumber;
	}
	public void setValidateNumber(String validateNumber) {
		this.validateNumber = validateNumber;
	}
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}
	
}
