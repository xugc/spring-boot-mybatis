///**
// * @Title UserDetailServerImpl.java
// * @Package com.boot.spring.security
// * @Description TODO
// * Copyright: Copyright (c) 2016 
// * Company:*******
// * 
// * @author 徐故成
// * @date 2016-6-20 下午6:37:18
// * @version V1.0
// */
//package com.boot.spring.security;
//
//import java.util.ArrayList;
//import java.util.List;
//
//import org.apache.commons.logging.Log;
//import org.apache.commons.logging.LogFactory;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.security.core.authority.SimpleGrantedAuthority;
//import org.springframework.security.core.userdetails.User;
//import org.springframework.security.core.userdetails.UserDetails;
//import org.springframework.security.core.userdetails.UserDetailsService;
//import org.springframework.security.core.userdetails.UsernameNotFoundException;
//
//import com.boot.spring.dao.UserMapper;
//
///**
// * @ClassName UserDetailServerImpl
// * @Description TODO
// * 
// */
//public class UserDetailServicesImpl implements UserDetailsService {
//	private static Log log = LogFactory.getLog(UserDetailServicesImpl.class);
//	@Autowired
//	UserMapper userMapper;
//
//	@Override
//	public UserDetails loadUserByUsername(String userName)
//			throws UsernameNotFoundException {
//		com.boot.spring.domain.User user = userMapper
//				.selectByUserName(userName);
//		log.debug(user);
//		if (user == null)
//			throw new UsernameNotFoundException("用户不存在");
//		List<SimpleGrantedAuthority> authorities = new ArrayList<>();
//		authorities.add(new SimpleGrantedAuthority("admin"));
//		return new User(userName, user.getPassword(), authorities);
//	}
//
//}
