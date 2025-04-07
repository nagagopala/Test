package com.learning.employee_service.bean;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;


@Entity
public class Employees {
	@Id
	private int empId;
	private int deptId;
	private String empName;
	private int age;
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public int getDeptId() {
		return deptId;
	}
	public void setDeptId(int deptId) {
		this.deptId = deptId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public Employees(int empId, int deptId, String empName, int age) {
		super();
		this.empId = empId;
		this.deptId = deptId;
		this.empName = empName;
		this.age = age;
	}
	public Employees() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Employees [empId=" + empId + ", deptId=" + deptId + ", empName=" + empName + ", age=" + age + "]";
	}
	
	

}
