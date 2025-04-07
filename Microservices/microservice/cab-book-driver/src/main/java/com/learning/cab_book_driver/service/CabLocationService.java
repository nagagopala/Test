package com.learning.cab_book_driver.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

import com.learning.cab_book_driver.constants.AppConstants;

@Service
public class CabLocationService {
	
	@Autowired
	private KafkaTemplate<String, Object> kafkaTemplate;
	
	public boolean updateLocation(String location) {
		
		kafkaTemplate.send(AppConstants.CAB_LOCATION,location);
		return true;
	}
	

}
