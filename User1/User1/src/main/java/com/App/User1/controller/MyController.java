package com.App.User1.controller;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.App.User1.Entity.Users;
import com.App.User1.service.UserService;

@RestController
public class MyController {
	
	@Autowired
	private UserService service;
	
	@GetMapping("/home")
	public String home() {
		
		return "this is home page";
	}
	
	//get users
	@GetMapping("/Users")
	public List<Users>  getUsers()
	{
		return this.service.getUsers();
	}
	
	
	@PostMapping("/Users")
	public Users addUsers(@RequestBody Users users) {
		return this.service.addUsers(users);
	}

}
