package com.dk.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dk.model.product.Product;
import com.dk.model.user.User;
import com.dk.repository.product.ProductRepository;
import com.dk.repository.user.UserRepository;

@RestController
@RequestMapping("/api/v1/")
public class TestController {

	@Autowired
	private UserRepository userRepository;

	@Autowired
	private ProductRepository productRepository;

	@PostMapping("/user/kaydet")
	public User kaydet(@RequestBody User user) {

		user = userRepository.save(user);

		return user;
	}

	@GetMapping("user")
	public List<User> getUser() {

		return userRepository.findAll();
	}

	@PostMapping("product/kaydet")
	public Product db2(@RequestBody Product product) {

		product = productRepository.save(product);

		return product;
	}

	@GetMapping("product")
	public List<Product> getProduct() {

		return productRepository.findAll();
	}

}
