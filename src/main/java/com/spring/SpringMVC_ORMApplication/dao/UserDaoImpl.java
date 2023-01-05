package com.spring.SpringMVC_ORMApplication.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.spring.SpringMVC_ORMApplication.model.Users;


@Repository
@Transactional
public class UserDaoImpl implements UserDao{

	
	@Autowired
	public HibernateTemplate hibernateTemplate;


	@Override
	public int register(Users user) {
		int i = (int) hibernateTemplate.save(user);
		return i;
	}

	@Override
	public List<Users> login(String userName, String password) {
		
		String query = "select u.type from Users u where u.uname=?0 and u.pswd=?1";
		System.out.println("userdaoimpl" + userName + "" + password);
		Object[] queryparam = { userName,password};
		return (List<Users>) hibernateTemplate.find(query, queryparam);
		
	}

}
