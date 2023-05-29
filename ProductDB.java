package com.telusko.ProductSpring;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface ProductDB extends JpaRepository<Product, Integer>{

//	List<Product> findByPlace(String place);

	List<Product> findByWarrantyLessThanEqual(int currentYear);

	List<Product> findByName(String name);

	
	
}
