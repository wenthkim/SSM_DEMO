package com.wsj.ssh.service;

import java.util.List;

import com.wsj.ssh.bean.User;

public interface UserService {

	String register(User user);

	User login(User user);
	
	User findUserById(Integer id);
	
	List<User> findAll();
}
