package com.saily.springpractice.ishop.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.saily.springpractice.ishop.entity.Product;
import com.saily.springpractice.ishop.repository.ProductRepository;

@Service
public class ProductServiceImpl implements ProductService {

	@Autowired
	private ProductRepository productRepository;
	
	@Override
	public Product createProduct(Product product) {
		return this.productRepository.save(product);
	}

	@Override
	public List<Product> getAllProducts() {
		return this.productRepository.findAll();		
	}

	@Override
	public Product getProductById(Long productId) {
		// TODO Auto-generated method stub
		return this.productRepository.findById(productId).get();
	}

}
