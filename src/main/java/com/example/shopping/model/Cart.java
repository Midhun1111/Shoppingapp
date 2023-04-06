package com.example.shopping.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="cart")
public class Cart {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	int id;
	
	@ManyToOne
	@JoinColumn(name="product_id")
	Product product;
	
	@OneToOne
	@JoinColumn(name="user_id")
	User user;
	
	public Integer quantity;
	
	public Double totalprice;

	public Cart(int id, Product product, User user, Integer quantity, Double totalprice) {
		super();
		this.id = id;
		this.product = product;
		this.user = user;
		this.quantity = quantity;
		this.totalprice = totalprice;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	public Double getTotalprice() {
		return totalprice;
	}

	public void setTotalprice(Double totalprice) {
		this.totalprice = totalprice;
	}

	public Cart() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
