package com.spring.SpringMVC_ORMApplication.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="USERS")
public class Users {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int userId;
	private String userName;
	private String password;
	private String type;

	public Users(int userId, String userName, String password, String type) {
		this.userId = userId;
		this.userName = userName;
		this.password = password;
		this.type = type;
	}

	public Users() {
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
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

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	@Override
	public String toString() {
		return "Users [userId=" + userId + ", userName=" + userName + ", password=" + password + ", type=" + type + "]";
	}

}
