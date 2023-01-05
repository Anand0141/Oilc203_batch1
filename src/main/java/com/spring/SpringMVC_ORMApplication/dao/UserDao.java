package com.spring.SpringMVC_ORMApplication.dao;

import java.util.List;

import com.spring.SpringMVC_ORMApplication.model.Users;

public interface UserDao {

	public int register(Users user);
	
	public List<Users> login(String userName,String password);
}
