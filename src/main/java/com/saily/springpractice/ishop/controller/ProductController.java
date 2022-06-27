package com.saily.springpractice.ishop.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.saily.springpractice.ishop.entity.Product;
import com.saily.springpractice.ishop.service.ProductService;

@CrossOrigin(origins = "http://127.0.0.1:5500/", maxAge = 3600)
@RestController
@RequestMapping("/product")
public class ProductController {

	@Autowired
	private ProductService productService;

	@PostMapping(path = "/create", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public Product createProduct(@RequestBody  Product product) {
		System.out.println(product);
		return this.productService.createProduct(product);

	}
	@GetMapping("get-products")
	public List<Product>getAllProducts() {		
		return this.productService.getAllProducts();
	}

}
