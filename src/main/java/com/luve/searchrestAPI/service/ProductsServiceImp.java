package com.luve.searchrestAPI.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.luve.searchrestAPI.model.Products;
import com.luve.searchrestAPI.repo.ProductsRepo;

@Service
public class ProductsServiceImp implements ProductsService {
	
	private ProductsRepo repo;
	
	public ProductsServiceImp(ProductsRepo repo) {
		super();
		this.repo = repo;
	}

	@Override
	public List<Products> searchProducts(String query) {
		List<Products> products = repo.searchProducts(query);
		return products;
	}

	@Override
	public Products createProduct(Products pdt) {
		// TODO Auto-generated method stub
		return repo.save(pdt);
	}

}
