package com.example.spring_security.controller;

import org.springframework.security.web.csrf.CsrfToken;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import jakarta.servlet.http.HttpServletRequest;

@RestController
public class WelcomeController {
	
	@GetMapping("/")
	public String getMessage() {
		return "Welcome to Spring Security project";
	}
	
	@GetMapping("/csrf/token")
	public CsrfToken getToken(HttpServletRequest requset) {
		return (CsrfToken) requset.getAttribute("_csrf");
	}

}
