package com.wsj.ssh.bean;

import java.sql.SQLException;

import javax.sql.DataSource;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.wsj.ssh.action.UserAction;
import com.wsj.ssh.dao.UserDao;

public class MyTest {
	
	public static void main(String[] args) throws SQLException {
		ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
		UserDao userDao = (UserDao) ac.getBean("userDao");
		//userDao.register(new User(3, "w455", "55"));
		//userDao.login(new User("wsj","123"))
		System.out.println(userDao.findAll());
		//UserAction userAction = (UserAction) ac.getBean("userAction");
		//System.out.println(userAction);
		/*
		 * 
		DataSource dataSource = (DataSource) ac.getBean("dataSource");
		System.out.println(dataSource.getConnection());*/
	}
	/*
	@Test
	public void testget(){
		ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
		User user = (User) ac.getBean("user");
		System.out.println(user);
	}
	
	@Test
	public void testSave() {
		
	}*/

}
