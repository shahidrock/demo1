package com.example.demo1.Authentication.Models;

public class AuthenticationResponse {
	private final String jwt;
	
	public AuthenticationResponse(String jwt) {
		this.jwt = jwt;
	}

	public String getJwt() {
		return jwt;
	}
}
