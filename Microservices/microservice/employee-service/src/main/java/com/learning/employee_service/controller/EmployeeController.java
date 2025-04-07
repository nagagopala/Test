package com.learning.employee_service.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.learning.employee_service.bean.Employees;
import com.learning.employee_service.service.EmployeeService;

@RestController
@RequestMapping("/employe")
public class EmployeeController {
	
	@Autowired
	private EmployeeService employeeService;
	
	@GetMapping("/get/employees")
	public ResponseEntity<List<Employees>> getAllDepartments(){
		return employeeService.getAllEmployees();
	}
	@GetMapping("/getById/{id}")
	public ResponseEntity<Employees> getByID(@PathVariable("id") int id){
		return employeeService.getById(id);
	}
	
	@PostMapping("/add/employee")
	public ResponseEntity<Employees> addDepartment(@RequestBody Employees employee){
		
		return employeeService.addEmployee(employee);
	}

}
