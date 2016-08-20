package com.wsj.ssh.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wsj.ssh.bean.User;
import com.wsj.ssh.dao.UserDao;
import com.wsj.ssh.service.UserService;

@Service("userService")
public class UserServiceImpl implements UserService {

	@Autowired
	private UserDao userDao;
	
	public UserServiceImpl() {
		
	}

	
	public String register(User user) {		
		return userDao.register(user);
	}

	public User login(User user) {		
		return userDao.login(user);
	}

	public User findUserById(Integer id) {		
		return userDao.findUserById(id);
	}

	public List<User> findAll() {		
		return userDao.findAll();
	}

}
