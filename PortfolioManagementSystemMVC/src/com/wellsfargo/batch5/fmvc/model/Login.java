package com.wellsfargo.batch5.fmvc.model;

import java.time.LocalDate;

public class Login {

	private String username;
	private String  Password;
	
	public Login() {
		
	}

	public Login(String username, String password) {
		super();
		this.username = username;
		Password = password;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return Password;
	}

	public void setPassword(String password) {
		Password = password;
	}

}