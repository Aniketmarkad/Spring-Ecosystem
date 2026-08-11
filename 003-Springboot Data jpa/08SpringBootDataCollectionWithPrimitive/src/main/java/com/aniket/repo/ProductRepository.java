package com.aniket.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.aniket.entity.Product;

public interface ProductRepository extends JpaRepository<Product, Integer> {

}
