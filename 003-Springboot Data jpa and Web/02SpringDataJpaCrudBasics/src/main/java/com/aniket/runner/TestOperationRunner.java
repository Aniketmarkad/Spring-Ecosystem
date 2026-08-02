package com.aniket.runner;

import java.util.Arrays;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.aniket.entity.Product;
import com.aniket.repo.ProductRepository;

@Component
public class TestOperationRunner implements CommandLineRunner{

	@Autowired
	private ProductRepository repo;
	
	public void run(String... args) throws Exception 
	{
		
		Product p1 = new Product(10,"p2",300.0);
		Product p2 = new Product(11,"p3",400.0);
		Product p3 = new Product(12,"p4",500.0);
		
		//save
		/*
		repo.save(p1);
		repo.save(p2);
		repo.save(p3);
		*/
		
		//save all
		repo.saveAll(Arrays.asList(p1,p2,p3));
		
		//findAll
		System.out.println("1]result of fina all by id:");
		Iterable<Product>data = repo.findAll();
		
		for(Product p : data)
		{
			System.out.println(p);
		}
		
		//exists by id
		
		System.out.println("2]is id exist :"+repo.existsById(11));
		
		//count 
		System.out.println("3]count is :"+repo.count());
		
		//findById
		
		Optional<Product> pob = repo.findById(11);
		
		System.out.println("4]find by id result :"+pob);
		
		//find all by id
		System.out.println("5]result after find all by id:-");
		
		Iterable<Product>list = repo.findAllById(Arrays.asList(10,11,12));
		
		for(Product pobj : list)
		{
			System.out.println(pobj);
		}
		
		//delete by id
		repo.deleteById(11);
		
       System.out.println("6] result after delete by id 11 removed:-");
		
		Iterable<Product>list1 = repo.findAllById(Arrays.asList(10,11,12));
		
		for(Product pobj : list1)
		{
			System.out.println(pobj);
		}
		
		//delete all by id 
		repo.deleteAll();
        System.out.println("7] result after delete all:-");
		
		Iterable<Product>list2 = repo.findAllById(Arrays.asList(10,11,12));
		
		for(Product pobj : list1)
		{
			System.out.println(pobj);
		}
	}
			
	
}
