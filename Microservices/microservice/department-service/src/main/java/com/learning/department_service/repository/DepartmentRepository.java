package com.learning.department_service.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.learning.department_service.bean.Departmet;

public interface DepartmentRepository extends JpaRepository<Departmet, Integer>{

}
