package com.learning.employee_service2.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.learning.employee_service2.bean.Employees;

@Repository
public interface EmployeeRepository extends JpaRepository<Employees, Integer>{
	public Employees findByDeptId(int deptId);

}
