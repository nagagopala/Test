package com.learning.department_service.service;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import com.learning.department_service.bean.Departmet;
import com.learning.department_service.bean.Employees;
import com.learning.department_service.controller.EmployeeInterface;
import com.learning.department_service.repository.DepartmentRepository;

@Service
public class DepartmentService {

	@Autowired
	private DepartmentRepository departmentRepo;

	@Autowired(required=true)
	private EmployeeInterface empInterface;


	public ResponseEntity<List<Departmet>> getAllDepartments() {

		return new ResponseEntity<>(departmentRepo.findAll(),HttpStatus.OK);
	}

	public ResponseEntity<Departmet> addDepartment(Departmet department) {
		// TODO Auto-generated method stub
		departmentRepo.save(department);
		return new ResponseEntity<>(department,HttpStatus.CREATED);
	}

	public ResponseEntity<Departmet> getById(int id) {
		// TODO Auto-generated method stub
		Departmet dept=departmentRepo.findById(id).get();
		return new ResponseEntity<>(dept,HttpStatus.OK);
	}

	public ResponseEntity<List<Departmet>> getDeptWithEmployee() {
		List<Departmet> list= departmentRepo.findAll();
		List<Departmet> deptWithEmploye=new ArrayList<>();
		

		for(Departmet dept:list) {
			int id=dept.getDepId();
			Employees emp=new Employees();
			emp=empInterface.getByDeptID(id);
			if (emp!=null) {
				if (id==emp.getDeptId()) {
					List<Employees> employee=new ArrayList<>();
					dept.setEmployees(employee);
					deptWithEmploye.add(dept);
					employee.add(emp);
				}
			}
		}
		return new ResponseEntity<>(deptWithEmploye,HttpStatus.OK);
	}

}
