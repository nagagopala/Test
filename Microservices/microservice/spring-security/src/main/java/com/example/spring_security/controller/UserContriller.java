package com.example.spring_security.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.spring_security.bean.SecureUser;
import com.example.spring_security.repository.SecureUserRepositoy;
import com.example.spring_security.service.SecureUserService;

@RestController
//@RequestMapping("/users")
public class UserContriller {
	
	@Autowired
	private SecureUserRepositoy userRepo;
	@Autowired
	private SecureUserService userService; 
	@PostMapping("/register")
	public SecureUser registerUser(@RequestBody SecureUser user) {
		System.out.println(user);
		
		return userService.addUser(user);
	}

}
