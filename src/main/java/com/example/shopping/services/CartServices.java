package com.example.shopping.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.shopping.model.Cart;
import com.example.shopping.model.Product;
import com.example.shopping.model.User;
import com.example.shopping.repo.CartRepository;

@Service
public class CartServices {
	
	@Autowired
	CartRepository cartRepository;
	
	public List<Cart> getAllCart(){
		return cartRepository.findAll();
	}
	
	public List<Product> findProducts(User user){
		List<Cart> cartitems=cartRepository.findByUser(user);
		List<Product> products=new ArrayList<>();
		cartitems.forEach(p->products.add(p.getProduct()));
		return null;
	}
}
