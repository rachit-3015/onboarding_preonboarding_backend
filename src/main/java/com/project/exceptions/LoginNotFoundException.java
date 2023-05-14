package com.project.exceptions;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class LoginNotFoundException extends RuntimeException{

	String user;
	String username;
	String password;
	String empType;
	
	public LoginNotFoundException(String user,String username,String password,String empType) {
		super(String.format("%s not found with %s , %s and %s",user,username,password,empType));
		this.user = user;
		this.username = username;
		this.password = password;
		this.empType = empType;
	}
}
