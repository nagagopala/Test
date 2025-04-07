package com.learning.department_service.bean;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Departmet {
	@Id
	private int depId;
	private String depName;
	@OneToMany
	private List<Employees> employees;
	public int getDepId() {
		return depId;
	}
	public void setDepId(int depId) {
		this.depId = depId;
	}
	public String getDepName() {
		return depName;
	}
	public void setDepName(String depName) {
		this.depName = depName;
	}
	public List<Employees> getEmployees() {
		return employees;
	}
	public void setEmployees(List<Employees> employees) {
		this.employees = employees;
	}
	public Departmet(int depId, String depName, List<Employees> employees) {
		super();
		this.depId = depId;
		this.depName = depName;
		this.employees = employees;
	}
	public Departmet() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Departmet [depId=" + depId + ", depName=" + depName + ", employees=" + employees + "]";
	}
	
	

}
