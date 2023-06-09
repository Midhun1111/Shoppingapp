package com.example.shopping.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.shopping.model.Cart;
import com.example.shopping.model.User;
@Repository
public interface CartRepository extends JpaRepository<Cart, Integer> {
	List<Cart> findByUser(User user);
}
