package com.learning.ProductMannaging.bean;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Product {
	@Id
	private int pId;
	private String pName;
	private String pPlace;
	private String waranty;
	public int getpId() {
		return pId;
	}
	public void setpId(int pId) {
		this.pId = pId;
	}
	public String getpName() {
		return pName;
	}
	public void setpName(String pName) {
		this.pName = pName;
	}
	public String getpPlace() {
		return pPlace;
	}
	public void setpPlace(String pPlace) {
		this.pPlace = pPlace;
	}
	public String getWaranty() {
		return waranty;
	}
	public void setWaranty(String waranty) {
		this.waranty = waranty;
	}
	public Product(int pId, String pName, String pPlace, String waranty) {
		super();
		this.pId = pId;
		this.pName = pName;
		this.pPlace = pPlace;
		this.waranty = waranty;
	}
	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Product [pId=" + pId + ", pName=" + pName + ", pPlace=" + pPlace + ", waranty=" + waranty + "]";
	}
	

}
