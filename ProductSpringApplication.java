package com.telusko.ProductSpring;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class ProductSpringApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(ProductSpringApplication.class, args);
		
		ProductService service = context.getBean(ProductService.class);
		
//		   List<Product> products = service.getAllProducts();
//	        for(Product p : products){
//	            System.out.println(p);
//	        }
		

		
//		String productPlace = "Shelf";
//		List<Product> product = service.getProductByPlace(productPlace);
//		for(Product p : product) {
//			System.out.println(p);
//		}
		
		String productName = "Java Black Book";
		List<Product> product = service.getProduct(productName);
		for(Product p : product) {
			System.out.println(p);
		}
		
		
		List<Product> productOut = service.getOutOfWarrantyProducts();
		for(Product p : productOut) {
			System.out.println(p);
		}
		
	}

}
