package com.learning.ProductMannaging.service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.learning.ProductMannaging.bean.Product;
import com.learning.ProductMannaging.bean.ProductRepo;

@Service
public class ProductService {
	
	@Autowired
	ProductRepo prodRepo;
	List<Product> list=new ArrayList<>();

	public void add(Product product) {
		
		prodRepo.save(product);
		
	}

	public List<Product> getAll() {
		list=prodRepo.findAll();
		return list;
		
	}

	public List<Product> getByWaranty(String waranty) {
		List<Product> warantyList=new ArrayList<>();
		for (Product product : list) {
			if (product.getWaranty().equals(waranty)) {
				warantyList.add(product);
				System.out.println(product);
			}
		}
		return warantyList;
	}

}
