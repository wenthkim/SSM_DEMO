package com.wsj.ssh.dao;

import java.util.List;

import com.wsj.ssh.bean.User;

public interface UserDao {

	String register(User user);

	User login(User user);
	
	User findUserById(Integer id);
	
	List<User> findAll();
}
