package com.saily.springpractice.ishop;

import java.net.URISyntaxException;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.saily.springpractice.ishop.utility.CreateProducts;

@SpringBootApplication
public class IShopApplication {

	public static void main(String[] args) {
		SpringApplication.run(IShopApplication.class, args);
		try {
			new CreateProducts().createTestProducts();
		} catch (URISyntaxException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
