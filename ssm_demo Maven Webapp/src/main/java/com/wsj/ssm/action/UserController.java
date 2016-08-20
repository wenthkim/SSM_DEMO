package com.wsj.ssm.action;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.wsj.ssm.service.UserService;

@Controller
@Scope(value="prototype")
@RequestMapping("/user")
public class UserController {

	@Autowired
	private UserService userservice;
	
	@RequestMapping("/find.do")
	public void find(HttpServletResponse response) throws IOException {		
		System.out.println(userservice.findall());
		PrintWriter writer = response.getWriter();
		writer.print(userservice.findall());
	}
}
