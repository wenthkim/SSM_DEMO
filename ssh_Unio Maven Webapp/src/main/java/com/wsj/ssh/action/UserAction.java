package com.wsj.ssh.action;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletResponse;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Namespace;
import org.apache.struts2.convention.annotation.ParentPackage;
import org.apache.struts2.convention.annotation.Result;
import org.apache.struts2.convention.annotation.Results;
import org.apache.struts2.interceptor.ServletResponseAware;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.alibaba.fastjson.JSONObject;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.wsj.ssh.bean.User;
import com.wsj.ssh.dao.UserDao;
import com.wsj.ssh.service.UserService;

@ParentPackage("json-default")
@Namespace("/user")
@Controller("userAction")
@Scope(value="prototype")
@Result(type="json")
public class UserAction extends ActionSupport implements ServletResponseAware,ModelDriven<User>{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Autowired
	private UserService userService;
	
	private User user = new User();
	//private String username;
	
	private HttpServletResponse response;
	
	private List<User> userLists = new ArrayList<User>();
	
	
	/*
	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}*/


	public List<User> getUserLists() {
		return userLists;
	}


	public void setUserLists(List<User> userLists) {
		this.userLists = userLists;
	}

	@Action(value="/save",results=@Result(name="save-success",location="/index.jsp"))
	public String save() {
		userService.register(user);
		System.out.println("success");
		return "save-success";
	}
	
	@Action(value="/find",results=@Result(name="save-success",location="/index.jsp"))	
	public String find() {	
		System.out.println(userService.findUserById(1));		
		return "save-success";
	}	
	
	@Action(value="/findall")
	public void findAll() throws IOException {
		
		userLists = userService.findAll();
		PrintWriter writer = response.getWriter();
		writer.print(JSONObject.toJSONString(userLists));		 	        
		System.out.println(user.getUsername());		
		
	}

	public void setServletResponse(HttpServletResponse response) {
		
		this.response = response;
	}


	public User getModel() {
		// TODO Auto-generated method stub
		return user;
	}

	
	
	
}
