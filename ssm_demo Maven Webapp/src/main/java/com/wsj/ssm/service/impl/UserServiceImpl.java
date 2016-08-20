package com.wsj.ssm.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wsj.ssm.bean.User;
import com.wsj.ssm.mapper.UserMapper;
import com.wsj.ssm.service.UserService;

@Service("userService")
public class UserServiceImpl implements UserService{

	@Autowired
	private UserMapper userMapper;	
	public List<User> findall() {		
		return userMapper.findall();
	}

}
