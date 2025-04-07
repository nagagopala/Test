package com.learning.cab_book_user.service;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class LocationService {
	
	@KafkaListener(topics = "cab-location",groupId = "user-group")
	public void cabLocations(String locations) {
		System.out.println(locations);
		
	}

}
