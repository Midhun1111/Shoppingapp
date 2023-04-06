package com.example.shopping.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.shopping.model.User;
import com.example.shopping.services.UserServices;

@RestController
@RequestMapping("/users")
public class UserController {
	@Autowired
	public UserServices userservices;
	
	@PostMapping("/add")
	public User addUser(@RequestBody User user) {
		return userservices.createUser(user);
	}
	
	
	@GetMapping("/all")
	public List<User> getUsers() {
		return userservices.listUsers();
	}
}
