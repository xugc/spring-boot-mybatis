package com.boot.spring.domain;

import java.io.Serializable;

public class User implements Serializable{
	
    /**  
	* @Fields serialVersionUID : TODO(用一句话描述这个变量表示什么)  
	*/  
	private static final long serialVersionUID = 6664390948108988955L;

	private Integer id;

    private String loginName;

    private String password;

    private String userName;

    private String email;

    private String phone;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getLoginName() {
        return loginName;
    }

    public void setLoginName(String loginName) {
        this.loginName = loginName == null ? null : loginName.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

	@Override
	public String toString() {
		return "User [id=" + id + ", loginName=" + loginName + ", password="
				+ password + ", userName=" + userName + ", email=" + email
				+ ", phone=" + phone + "]";
	}
    
}