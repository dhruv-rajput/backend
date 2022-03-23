package com.project.traveleasy.entity;

public class UserDetails {
	private String password;
	private String email;
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public UserDetails() {
		super();
		// TODO Auto-generated constructor stub
	}
	public UserDetails(String email, String password) {
		super();
		this.email = email;
		this.password = password;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email=email;
	}

	
}
