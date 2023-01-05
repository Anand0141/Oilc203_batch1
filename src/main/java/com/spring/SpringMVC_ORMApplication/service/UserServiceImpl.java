package com.spring.SpringMVC_ORMApplication.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import com.spring.SpringMVC_ORMApplication.dao.UserDao;
import com.spring.SpringMVC_ORMApplication.model.Users;

public class UserServiceImpl implements UserDao {

	@Autowired
	public UserDao dao;
	
	public int register(Users user) {
		return dao.register(user);
	}
	
	
	public List<Users> login(String userName, String password) {
		return dao.login(userName, password);
	}

}
