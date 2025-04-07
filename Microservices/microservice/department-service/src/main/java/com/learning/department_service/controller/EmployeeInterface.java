package com.learning.department_service.controller;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.learning.department_service.bean.Employees;



@FeignClient("EMPLOYEE-SERVICE2")
@Component
public interface EmployeeInterface {
	@GetMapping("/employe/get/employees")
	public ResponseEntity<List<Employees>> getAllDepartments();
	
	@GetMapping("/employe/getById/{id}")
	public ResponseEntity<Employees> getByID(@PathVariable("id") int id);
	
	@PostMapping("/employe/add/employee")
	public ResponseEntity<Employees> addDepartment(@RequestBody Employees employee);
	
	@GetMapping("/employe/getBydeptId/{id}")
	public Employees getByDeptID(@PathVariable("id") int id);

}
