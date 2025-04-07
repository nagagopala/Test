package com.example.spring_security.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.spring_security.bean.Product;


@Service
public class ProductService {
	List<Product> productList=new ArrayList<>();
	

	public List<Product> getAllProducts() {
		productList.add(new Product(101, "Pen", 10));
		productList.add(new Product(102, "Pencil", 5));
		productList.add(new Product(103, "Notebook", 20));
		productList.add(new Product(104, "Eraser", 2));
		productList.add(new Product(105, "Marker", 15));
		productList.add(new Product(106, "Ruler", 3));
		productList.add(new Product(107, "Highlighter", 7));
		productList.add(new Product(108, "Stapler", 12));
		productList.add(new Product(109, "Binder", 8));
		productList.add(new Product(110, "Paper Clips", 1));
		
		return productList;
	}


	public void addProduct(Product product) {
		productList.add(product);
		
	}

}
