package com.wsj.ssh.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.stereotype.Component;



@Entity
@Table(name="sshuser")
@Component("user")
public class User {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="uid")
	private Integer uid;
	
	@Column(name="username")
	private String username;
	@Column(name="password")
	private String password;
	
	public User() {
		
	}

	public User(Integer uid, String username, String password) {
		
		this.uid = uid;
		this.username = username;
		this.password = password;
	}


	
	
	public User(String username, String password) {
		super();
		this.username = username;
		this.password = password;
	}

	public Integer getUid() {
		return uid;
	}


	public void setUid(Integer uid) {
		this.uid = uid;
	}



	public String getUsername() {
		return username;
	}


	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	@Override
	public String toString() {
		return "User [uid=" + uid + ", username=" + username + ", password="
				+ password + "]";
	}
	
	

}
