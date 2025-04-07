package com.learning.employee_service.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.learning.employee_service.bean.Employees;

@Repository
public interface EmployeeRepository extends JpaRepository<Employees, Integer>{

}
