package com.springdemo.springjdbc;

public class User {
	private String userName;
	private String password;
	private int id;
	
	
	
	public User() {
		super();
	}

	public User(int id, String userName, String password) {
		super();
		this.userName = userName;
		this.password = password;
		this.id = id;
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
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
}
