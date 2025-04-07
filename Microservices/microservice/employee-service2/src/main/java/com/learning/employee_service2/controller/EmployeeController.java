package com.learning.employee_service2.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.learning.employee_service2.bean.Employees;
import com.learning.employee_service2.service.EmployeeService;

@RestController
@RequestMapping("/employe")
public class EmployeeController {
	
	private static final Logger logger=LoggerFactory.getLogger(EmployeeController.class); 
	
	@Autowired
	private EmployeeService employeeService;
	
	@GetMapping("/get/employees")
	public ResponseEntity<List<Employees>> getAllDepartments(){
		logger.info("Method getAllDepartments()");
		return employeeService.getAllEmployees();
	}
	@GetMapping("/getById/{id}")
	public ResponseEntity<Employees> getByID(@PathVariable("id") int id){
		logger.info("Method getByID()");
		return employeeService.getById(id);
	}
	
	@PostMapping("/add/employee")
	public ResponseEntity<Employees> addDepartment(@RequestBody Employees employee){
		logger.info("Method addDepartmen()");
		return employeeService.addEmployee(employee);
	}
	@GetMapping("/getBydeptId/{id}")
	public Employees getByDeptID(@PathVariable("id") int id){
		logger.info("Method getByID()");
		return employeeService.getByDeptId(id);
	}

}
