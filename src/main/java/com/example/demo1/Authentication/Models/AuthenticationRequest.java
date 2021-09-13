package com.example.demo1.Authentication.Models;

public class AuthenticationRequest {
	public String userName;
	public String password;
	
	public AuthenticationRequest(){
		
	}
	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
}
