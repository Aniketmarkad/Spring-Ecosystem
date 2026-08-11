package com.aniket.runner;

import java.util.Arrays;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.aniket.entity.Book;
import com.aniket.repo.BookRepository;

@Component
public class TestDataRunner implements CommandLineRunner {

	
	@Autowired
	private BookRepository repo;
	@Override
	public void run(String... args) throws Exception {
		

		repo.saveAll(
				Arrays.asList(
						new Book(101, "SBMS", "RAGHU", 300.0, "Backend"),
						new Book(102, "CORE", "RAGHU", 200.0, "Backend"),
						new Book(103, "ADV", "ASHOK", 400.0, "Backend"),
						new Book(104, "REACT", null, 500.0, "Frontend"),
						new Book(105, "HTML", "RAGHU", 600.0, "Frontend"),
						new Book(106, "CSS", null, 300.0, "Frontend"),
						new Book(107, "ANGULAR", "ASHOK", 800.0, "Frontend"),
						new Book(108, "SQL", "RAGHU", 200.0, "Database")
						)
				);
		
		repo.findByBookIdBetween(101, 105)
		.forEach(System.out::println);
		
		Optional<Book> opt =  repo.findByBookIdIs(1050);
		if(opt.isPresent())
			System.out.println(opt.get());
		else 
			System.out.println("No Data Found");
		
		
	}

}

