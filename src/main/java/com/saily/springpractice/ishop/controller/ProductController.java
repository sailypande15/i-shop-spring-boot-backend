package com.saily.springpractice.ishop.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
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
	@GetMapping("/get-products")
	public List<Product>getAllProducts() {		
		return this.productService.getAllProducts();
	}
	
	@GetMapping("get-products/{productId}")
	public Product getProductById(@PathVariable Long productId) {
		return this.productService.getProductById(productId);
	}
	
	@DeleteMapping("/delete/{productId}")
	 	public ResponseEntity<String> deleteProduct(@PathVariable Long productId) {		
		System.out.println("product id "+productId+"  deleted");
		Product product = this.productService.getProductById(productId);
		this.productService.deleteProduct(product);
		return new ResponseEntity<String>("product id "+productId+" deleted successfully", HttpStatus.OK);
		
	}
	
	@PutMapping(path="/update/{productId}",consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public String updateProduct(@RequestBody Product product, @PathVariable Long productId) {
		Product productDB = this.productService.getProductById(productId);
		if(!product.getCategory().isEmpty()) {
			productDB.setCategory(product.getCategory());
		}
		if(!product.getDescription().isEmpty()) {
			productDB.setDescription(product.getDescription());
		}
		if(!product.getImage().isEmpty()) {
			productDB.setImage(product.getImage());
		}
		if(!(product.getPrice()==0||product.getPrice()==null)) {
			productDB.setPrice(product.getPrice());
		}
		if(!(product.getRating()==null)) {
			product.setRating(product.getRating());
		}
		if(!product.getTitle().isEmpty()) {
			productDB.setTitle(product.getTitle());
		}
		this.productService.updateProduct(productDB);
		System.out.println("updated product "+product);
		return "product id "+productId+" updated";
	}

}
