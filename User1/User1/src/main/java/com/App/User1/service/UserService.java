package com.App.User1.service;

import java.util.List;

import com.App.User1.Entity.*;
public interface UserService {

	public List<Users> getUsers();
	
	public Users addUsers(Users users);

	
}