package com.telusko.ProductSpring;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.AutoConfiguration;
import org.springframework.stereotype.Component;

@Component
public class ProductService {
	@Autowired
	ProductDB db;

	public List<Product> getOutOfWarrantyProducts(){
		int currentYear = java.time.Year.now().getValue();
		return db.findByWarrantyLessThanEqual(currentYear);
	}
	
	public List<Product> getProduct(String name){

	        return db.findByName(name);
	    }
    
//    public void addProduct(Product p){
////        products.add(p);
//    	db.save(p);
//    }
//
//    public List<Product> getAllProducts(){
//        return db.findAll();
//    }
//
  
//
//  public List<Product> getProductByPlace(String place) {
//	
//	  return db.findByPlace(place);
//	
//}  
	
//	public List<Product> getProductByPlace(String place) {
//		return products.stream()
//				.filter(p -> p.getPlace().equalsIgnoreCase(place))
//				.collect(Collectors.toList());
//	}
//	public List<Product> getOutOfWarrantyProducts() {
//		return products.stream()
//				.filter(p -> p.getWarranty() <= java.time.Year.now().getValue())
//				.collect(Collectors.toList());
//}
}