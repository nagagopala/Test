package com.learning.ProductMannaging.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.learning.ProductMannaging.bean.Product;
import com.learning.ProductMannaging.service.ProductService;

@RestController
public class ProductController {
	
	
	private final ProductService prodService;
	
	
	public ProductController(ProductService prodService) {
		this.prodService=prodService;
	}
	
	@GetMapping("/getAll/prods")
	public List<Product> getAllProds(){
		List<Product> list=prodService.getAll();
		return list;
	}
	
	@PostMapping("/add/prod")
	public Product addProd(@RequestBody Product prod){
		prodService.add(prod);
		return prod;
	}

}
