package com.lerning.SpringSecurity.controll;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.lerning.SpringSecurity.bean.UserRepository;
import com.lerning.SpringSecurity.bean.Users;

@RestController
public class UserCntroll {
	
	@GetMapping("/")
	public String home() {
		return "Welcome";
	}
	
	private UserRepository userRepo;
	
	@GetMapping("/userBy/{name}")
	public Users getUserByID(@PathVariable("name") String userName) {
		Users user=userRepo.findByUserName(userName);
		
		return user;
		
	}

}
