package com.learning.cab_book_driver.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.learning.cab_book_driver.service.CabLocationService;

@RestController
@RequestMapping("/location")
public class CabLocationController {
	@Autowired
	private CabLocationService locationService;
	
	@PutMapping
	public ResponseEntity<Map<String, String>> locationUpdate() throws InterruptedException{
		int range=100;
		while (range>0) {
			//System.out.println(Math.random()+" "+Math.random());
			Thread.sleep(1000);
			locationService.updateLocation(Math.random()+" , "+Math.random());
			range--;
		}
		
		Map<String, String> map=new HashMap<>();
		map.put("message", "location updated");
		
		return new ResponseEntity<>(map,HttpStatus.OK);
	}
	

}
