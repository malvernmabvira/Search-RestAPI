package com.luve.searchrestAPI.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.luve.searchrestAPI.model.Products;

public interface ProductsRepo extends JpaRepository<Products, Long> {
	
	@Query("SELECT p FROM Products p WHERE " + "p.name LIKE CONCAT('%',:query, '%')" +
	"Or p.description LIKE CONCAT('%',:query, '%')")
	List<Products> searchProducts(String query);

}
