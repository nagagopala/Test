package com.learning.main;

import java.util.List;

import com.learning.ProductMannaging.bean.Product;
import com.learning.ProductMannaging.service.ProductService;

public class MainTest {

	public static void main(String[] args) {
		ProductService productService=new ProductService();
		productService.add(new Product(101, "laptop", "table", "2025"));
		productService.add(new Product(102, "smartphone", "electronics", "2024"));
		productService.add(new Product(103, "desk chair", "furniture", "2023"));
		productService.add(new Product(104, "water bottle", "kitchen", "2022"));
		productService.add(new Product(105, "gaming mouse", "electronics", "2025"));
		productService.add(new Product(106, "bookshelf", "furniture", "2024"));
		productService.add(new Product(107, "coffee maker", "kitchen", "2023"));
		productService.add(new Product(108, "headphones", "electronics", "2022"));
		productService.add(new Product(109, "office supplies", "stationery", "2025"));
		productService.add(new Product(110, "outdoor grill", "home", "2024"));
		productService.add(new Product(111, "smart TV", "electronics", "2023"));
		
		List<Product> pList= productService.getAll();
		System.out.println(pList);
		List<Product> pListWaranty=productService.getByWaranty("2024");
		System.out.println(pListWaranty);
	}

}
