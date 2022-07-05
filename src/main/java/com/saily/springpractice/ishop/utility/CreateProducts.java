package com.saily.springpractice.ishop.utility;

import java.net.URI;
import java.net.URISyntaxException;

import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import com.saily.springpractice.ishop.entity.Product;
import com.saily.springpractice.ishop.entity.Ratings;

public class CreateProducts {

	public void createTestProducts() throws URISyntaxException {
		RestTemplate restTemplate = new RestTemplate();
	     
	    final String baseUrl = "http://localhost:"+8082+"/product/create/";
	    URI uri = new URI(baseUrl);
	     
	    Product product= new Product(20L, 
	    		"DANVOUY Womens T Shirt Casual Cotton Short", 
	    		12.99, 
	    		"Cotton,pandex, Features: Casual, Short Sleeve, "
	    		+ "Letter Print,V-Neck,Fashion Tees, The fabric is soft and has some stretch., "
	    		+ "Occasion Casual Office Beach School Home/Street. Season: Spring,Summer,"
	    		+ "Autumn,Winter.", "women's clothing", 
	    		"https://fakestoreapi.com/img/61pHAEJ4NML._AC_UX679_.jpg",
	    		new Ratings(3.6, 145));
	    ResponseEntity<Product> result = restTemplate.postForEntity(uri, product, Product.class);
	    System.out.println(result.getBody());
	    product = new Product(20L, 
	    		"Opna Women's Short Sleeve Moisture", 
	    		7.95, 
	    		"100% Polyester, Machine wash, 100% cationic polyester interlock, "
	    		+ "Machine Wash & Pre Shrunk for a Great Fit, Lightweight, "
	    		+ "roomy and highly breathable with moisture wicking fabric which helps to "
	    		+ "keep moisture away, Soft Lightweight Fabric with comfortable V-neck collar and "
	    		+ "a slimmer fit, delivers a sleek, more feminine silhouette and Added Comfort",
	    		"women's clothing",
	    		"https://fakestoreapi.com/img/51eg55uWmdL._AC_UX679_.jpg",
	    		new Ratings(4.5, 146));
	    result = restTemplate.postForEntity(uri, product, Product.class);
	    System.out.println(result.getBody());
	    product = new Product(18L, 
	    		"MBJ Women's Solid Short Sleeve Boat Neck V ", 
	    		9.85, 
	    		"95% RAYON 5% SPANDEX, Made in USA or Imported, Do Not Bleach, "
	    		+ "Lightweight fabric with great stretch for comfort, "
	    		+ "Ribbed on sleeves and neckline / Double stitching on bottom hem",	    	    
	    		"women's clothing",
	    		"https://fakestoreapi.com/img/71z3kpMAYsL._AC_UY879_.jpg",
	    		new Ratings(4.7, 130));
	   result = restTemplate.postForEntity(uri, product, Product.class);
	   System.out.println(result.getBody());
	   product = new Product(17L, 
			   "Rain Jacket Women Windbreaker Striped Climbing Raincoats", 
	    		39.99, 
	    		"Lightweight perfet for trip or casual wear---Long sleeve with hooded, "
	    		+ "adjustable drawstring waist design. Button and zipper front closure raincoat, "
	    		+ "fully stripes Lined and The Raincoat has 2 side pockets are a good size to hold "
	    		+ "all kinds of things, it covers the hips, and the hood is generous but doesn't "
	    		+ "overdo it.Attached Cotton Lined Hood with Adjustable Drawstrings give it a real"
	    		+ " styled look.",	    	    
	    		"women's clothing",
	    		"https://fakestoreapi.com/img/71HblAHs5xL._AC_UY879_-2.jpg",
	    		new Ratings(3.8, 679));
	   result = restTemplate.postForEntity(uri, product, Product.class);
	   System.out.println(result.getBody());
	 
	  
	   
	}

}
