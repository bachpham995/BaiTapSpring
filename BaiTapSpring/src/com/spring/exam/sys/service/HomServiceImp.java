package com.spring.exam.sys.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.spring.exam.sys.dao.UserDAO;
import com.spring.exam.sys.model.User;

public class HomServiceImp implements HomeService{
	@Autowired
	public UserDAO userDao; 
	@Override
	public User getUserById(String id) {
		return userDao.getUserById(id);
	}

}
