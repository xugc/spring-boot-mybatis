/**
 * @Title UserDetailServerImpl.java
 * @Package com.boot.spring.security
 * @Description TODO
 * Copyright: Copyright (c) 2016 
 * Company:*******
 * 
 * @author 徐故成
 * @date 2016-6-20 下午6:37:18
 * @version V1.0
 */
package com.boot.spring.security;

import java.util.ArrayList;
import java.util.List;

import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

/**
 * @ClassName UserDetailServerImpl
 * @Description TODO
 * 
 */
public class UserDetailServicesImpl implements UserDetailsService {

	@Override
	public UserDetails loadUserByUsername(String userName)
			throws UsernameNotFoundException {
		List<SimpleGrantedAuthority> authorities = new ArrayList<>();
		authorities.add(new SimpleGrantedAuthority("role"));
		return new User("user", "pwd", authorities);
	}

}
