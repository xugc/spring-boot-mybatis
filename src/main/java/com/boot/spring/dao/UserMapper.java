package com.boot.spring.dao;

import org.apache.ibatis.annotations.Mapper;

import com.boot.spring.domain.User;

@Mapper
public interface UserMapper {
	int deleteByPrimaryKey(Integer id);

	int insert(User record);

	int insertSelective(User record);

	User selectByPrimaryKey(Integer id);

//	@Resource(name = "slaver1SqlSessionTemplate")
	User selectByUserName(String userName);

	int updateByPrimaryKeySelective(User record);

	int updateByPrimaryKey(User record);
}