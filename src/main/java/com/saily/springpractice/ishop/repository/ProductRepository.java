package com.saily.springpractice.ishop.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.saily.springpractice.ishop.entity.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
