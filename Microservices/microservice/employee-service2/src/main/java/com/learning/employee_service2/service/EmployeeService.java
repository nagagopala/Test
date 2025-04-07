package com.learning.employee_service2.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.learning.employee_service2.bean.Employees;
import com.learning.employee_service2.repository.EmployeeRepository;

@Service
public class EmployeeService {
	
	@Autowired
	private EmployeeRepository empRepository;

	public ResponseEntity<List<Employees>> getAllEmployees() {
		
		return new ResponseEntity<>(empRepository.findAll(),HttpStatus.OK);
	}

	public ResponseEntity<Employees> getById(int id) {
		Employees emp=empRepository.findById(id).get();
		
		return new ResponseEntity<Employees>(emp,HttpStatus.OK);
	}

	public ResponseEntity<Employees> addEmployee(Employees employee) {
		
		return new ResponseEntity<>(empRepository.save(employee),HttpStatus.CREATED);
	}

	public Employees getByDeptId(int id) {
		Employees emp=empRepository.findByDeptId(id);
		
		return emp;
	}

}
