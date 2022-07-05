package com.saily.springpractice.ishop.service;

import java.util.List;

import com.saily.springpractice.ishop.entity.Product;


public interface ProductService {
	
	public Product createProduct(Product product);
	public List<Product> getAllProducts();
	public Product getProductById(Long productId);
	public void deleteProduct(Product product);
	public void updateProduct(Product product);

}
