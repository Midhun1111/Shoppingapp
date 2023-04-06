package com.example.shopping.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.shopping.model.Product;
import com.example.shopping.services.ProductServices;

@RestController
@RequestMapping("/products")
public class ProductController {

	@Autowired	
	public ProductServices productServices;
	
	//getting all product details
	@GetMapping
	public List<Product> getAllProduct(){
		return productServices.getAllProducts();
	}
	
	
	//adding product data
	@PostMapping("/add")
	public Product addProduct(@RequestBody Product product){
		return productServices.saveProduct(product);
	}
	
	//getting product by id
	@GetMapping("/{id}")
	public Optional<Product> fetchProduct(@PathVariable Integer id){
		return productServices.getProduct(id);
	}

}
