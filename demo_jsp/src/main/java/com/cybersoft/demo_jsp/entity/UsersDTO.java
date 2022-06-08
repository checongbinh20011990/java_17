package com.cybersoft.demo_jsp.entity;

public class UsersDTO {
	private String username;
	private String role_name;
	
	public UsersDTO(String username, String role_name) {
		// TODO Auto-generated constructor stub
		super();
		this.username = username;
		this.role_name = role_name;
	}
	
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getRole_name() {
		return role_name;
	}
	public void setRole_name(String role_name) {
		this.role_name = role_name;
	}
	
	
}
