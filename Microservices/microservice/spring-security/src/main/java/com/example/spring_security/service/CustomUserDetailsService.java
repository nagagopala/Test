package com.example.spring_security.service;

import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;

import com.example.spring_security.bean.SecureUser;
import com.example.spring_security.repository.SecureUserRepositoy;

@Component
public class CustomUserDetailsService implements UserDetailsService{

	@Autowired
	private SecureUserRepositoy repository;
	
	@Autowired
	private CustomUserDetails userDetails;
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		SecureUser user=repository.findByUserName(username);
		if (Objects.isNull(user)) {
			throw new UsernameNotFoundException("User Not found");
			
		}
		return new CustomUserDetails(user);
	}

}
