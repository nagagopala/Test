package com.learning.employee_service2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class EmployeeService2Application {

	public static void main(String[] args) {
		SpringApplication.run(EmployeeService2Application.class, args);
	}

}
