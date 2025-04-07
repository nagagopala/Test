package com.learning.department_service.controller;

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

import com.learning.department_service.bean.Departmet;
import com.learning.department_service.service.DepartmentService;

@RestController
@RequestMapping("/department")
public class DepartmentController {
	
	private static final Logger logger=LoggerFactory.getLogger(DepartmentController.class);
	
	@Autowired
	private DepartmentService departmentService;
	
	@GetMapping("/get/departments")
	public ResponseEntity<List<Departmet>> getAllDepartments(){
		logger.info("Method getAllDepartments()");
		return departmentService.getAllDepartments();
	}
	@GetMapping("/getById/{id}")
	public ResponseEntity<Departmet> getByID(@PathVariable("id") int id){
		logger.info("Method getByID()");
		return departmentService.getById(id);
	}
	
	@PostMapping("/add/department")
	public ResponseEntity<Departmet> addDepartment(@RequestBody Departmet department){
		logger.info("Method addDepartment()");
		return departmentService.addDepartment(department);
	}
	
	@GetMapping("/deptAndEmployee")
	public ResponseEntity<List<Departmet>> getDeepartWithEmployee(){
		
		return departmentService.getDeptWithEmployee();
		
	}
	

}
