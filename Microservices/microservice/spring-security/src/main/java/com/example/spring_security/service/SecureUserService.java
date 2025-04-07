package com.example.spring_security.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.example.spring_security.bean.SecureUser;
import com.example.spring_security.repository.SecureUserRepositoy;

@Service
public class SecureUserService {
	
	@Autowired
	private SecureUserRepositoy repository;
	
	@Autowired
	private BCryptPasswordEncoder passwordEncoder;

	public SecureUser addUser(SecureUser user) {
		user.setPassword(passwordEncoder.
				encode(user.getPassword()));
		repository.save(user);
		// TODO Auto-generated method stub
		return user;
	}
	
	
	

}
