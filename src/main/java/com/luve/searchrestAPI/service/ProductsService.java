package com.luve.searchrestAPI.service;
import java.util.List;

import com.luve.searchrestAPI.model.Products;

public interface ProductsService {
	
	 List<Products> searchProducts(String query);
	 
	 Products createProduct(Products pdt);

}
