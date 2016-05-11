/**
 * @Title: UserService.java
 * @Package com.boot.spring.service
 * @Description: TODO
 * Copyright: Copyright (c) 2016 
 * Company:*******
 * 
 * @author 徐故成
 * @date 2016-5-9 下午6:40:54
 * @version V1.0
 */
package com.boot.spring.service;

import com.boot.spring.domain.User;

/**
 * @ClassName: UserService
 * @Description: TODO
 * 
 */
public interface UserService {
	public int addUser(User user);
	public void addUserError(User user) throws Exception;
}
