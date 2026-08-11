package com.aniket.repo;

import org.springframework.data.repository.CrudRepository;

import com.aniket.entity.Product;


public interface ProductRepository extends CrudRepository<Product, Integer> {

}
