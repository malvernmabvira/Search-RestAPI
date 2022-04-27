package com.luve.searchrestAPI.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.luve.searchrestAPI.model.Products;
import com.luve.searchrestAPI.service.ProductsService;

@RestController
@RequestMapping("/api")
public class MyController {
	
	private ProductsService service;

	public MyController(ProductsService service) {
		super();
		this.service = service;
	}
	
	@GetMapping("/products")
	public ResponseEntity<List<Products>> listOfProducts(@RequestParam("query") String query){
		return ResponseEntity.ok(service.searchProducts(query));
	}
	
	@PostMapping
	public Products createPdt(@RequestBody Products product) {
		return service.createProduct(product);
	}

}
