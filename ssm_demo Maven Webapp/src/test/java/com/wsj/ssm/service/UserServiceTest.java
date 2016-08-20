package com.wsj.ssm.service;

import static org.junit.Assert.*;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UserServiceTest {

	@Test
	public void testFindall() {
		ApplicationContext aContext = new ClassPathXmlApplicationContext("spring-mybatis.xml");
		UserService userService = (UserService) aContext.getBean("userService");
		System.out.println(userService);
	}

}
