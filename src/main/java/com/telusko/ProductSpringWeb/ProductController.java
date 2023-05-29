package com.telusko.ProductSpringWeb;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {
	
	@Autowired
	ProductService service;
	
	//hey, this is for products request
	@GetMapping("/products")
	public List<Product> getAllProducts(){
		return service.getAllProducts();
		
	}
	
	@GetMapping("/product/{name}")
	public List<Product>  getProduct(@PathVariable String name){
		return service.getProduct(name);
		
	}
	
	@PostMapping("/product")
	public void addProduct(@RequestBody Product p){
		 service.addProduct(p);
		
	}
	
}
  