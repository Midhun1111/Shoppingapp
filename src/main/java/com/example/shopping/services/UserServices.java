package com.example.shopping.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.shopping.model.User;
import com.example.shopping.repo.UserRepository;

@Service
public class UserServices {
	
	@Autowired
	public UserRepository userRepository;
	
	public User createUser(User user) {
		return userRepository.save(user);
	}
	
	public List<User> listUsers(){
		return userRepository.findAll();
	}
	
}
