package com.example.SpringSampleProj.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SampleController {
	
	@GetMapping("/message")
	public String message() {
		return "hellow world";
	}
	
	@GetMapping("/message/{name}")
	public String messageByName(@PathVariable String name) {
		return "hellow world "+name;
	}

}
