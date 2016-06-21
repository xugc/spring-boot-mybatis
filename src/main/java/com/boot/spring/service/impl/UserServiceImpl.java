/**
 * @Title UserServiceImpl.java
 * @Package com.boot.spring.service.impl
 * @Description TODO
 * Copyright: Copyright (c) 2016 
 * Company:*******
 * 
 * @author 徐故成
 * @date 2016-5-9 下午6:43:03
 * @version V1.0
 */
package com.boot.spring.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.boot.spring.dao.UserMapper;
import com.boot.spring.domain.User;
import com.boot.spring.service.UserService;

/**
 * @ClassName UserServiceImpl
 * @Description TODO
 * 
 */
@Service
@EnableAutoConfiguration
public class UserServiceImpl implements UserService {

	@Autowired
	UserMapper userMapper;

	@Override
	@Transactional(propagation = Propagation.REQUIRED)
	public int addUser(User user) {
		return userMapper.insert(user);
	}
	
	@Override
	@Transactional(propagation = Propagation.REQUIRED)
	public void addUserError(User user) throws Exception {
		userMapper.insertSelective(user);
		throw new RuntimeException("dfdf");
	}

	@Override
	public User getUserByUserName(String userName) {
		return userMapper.selectByUserName(userName);
	}

}
