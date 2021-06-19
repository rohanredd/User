package com.App.User1.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.App.User1.Entity.Users;
import com.App.User1.dao.UserDao;


@Service
public class UserServiceImp implements UserService{
	@Autowired
	private UserDao userDao;
	
	public UserServiceImp() {

	}

	@Override
	public List<Users> getUsers() {

		return userDao.findAll();
	}

	
	@Override
	public Users addUsers(Users users) {

		
		return userDao.save(users);
	}

	

	

	
	}
 
	
	
	

