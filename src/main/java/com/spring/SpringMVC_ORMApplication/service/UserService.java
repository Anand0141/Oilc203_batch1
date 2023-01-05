package com.spring.SpringMVC_ORMApplication.service;

import java.util.List;

import com.spring.SpringMVC_ORMApplication.model.Users;

public interface UserService {

	public int register(Users user);

	public List<Users> login(String userName, String password);

}
