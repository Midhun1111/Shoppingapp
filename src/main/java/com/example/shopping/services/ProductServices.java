package com.example.shopping.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.shopping.model.Product;
import com.example.shopping.repo.ProductRepository;
//import com.example.shopping.repo.UserRepository;

@Service
public class ProductServices {

	@Autowired
	public ProductRepository productRepository;
	
//	@Autowired
//	public UserRepository userRepository;
	
	public List<Product> getAllProducts(){
		return  productRepository.findAll();
	}
	
	public Product saveProduct(Product product) {
		return productRepository.save(product);
	}
	
	public Optional<Product> getProduct(Integer id) {
		return productRepository.findById(id);
	}
	
}
