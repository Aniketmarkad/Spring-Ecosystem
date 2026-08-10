package com.aniket.runner;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.aniket.entity.Book;
import com.aniket.ropo.BookRepository;

@Component
public class TestDataRunner implements CommandLineRunner {

	@Autowired
	private BookRepository repo;
	@Override
	public void run(String... args) throws Exception {
		
		repo.saveAll(
				Arrays.asList(
						new Book(101, "SBMS", "Aniket", 300.0, "Backend"),
						new Book(102, "CORE", "Aniket", 200.0, "Backend"),
						new Book(103, "ADV", "sagar", 400.0, "Backend"),
						new Book(104, "REACT", null, 500.0, "Frontend"),
						new Book(105, "HTML", "Aniket", 600.0, "Frontend"),
						new Book(106, "CSS", null, 300.0, "Frontend"),
						new Book(107, "ANGULAR", "sagar", 800.0, "Frontend"),
						new Book(108, "SQL", "Aniket", 200.0, "Database")
						)
				);
		
		//repo.getBooksByAuthor("Aniket").forEach(System.out::println);
		
		//repo.getBooksAuthorCost("A%", 200.0).forEach(System.out::println);

		repo.getBooksIds(Arrays.asList(101,106,108,111,134)).forEach(System.out::println);
	}

}
