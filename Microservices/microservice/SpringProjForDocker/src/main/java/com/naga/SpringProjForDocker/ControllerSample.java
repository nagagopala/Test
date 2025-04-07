package com.naga.SpringProjForDocker;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ControllerSample {
	
	@GetMapping("/")
	public String sampleMethod() {
		
		return "Welcome";
	}

}
