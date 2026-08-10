package com.aniket.ropo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.aniket.entity.Book;

@Repository
public interface BookRepository extends JpaRepository<Book, Integer> {

	//SQL: select * from booktab where author=?
		//@Query("SELECT b FROM Book b WHERE b.author=?1")
		@Query("SELECT b FROM Book b WHERE b.author = :abc")
		List<Book> getBooksByAuthor(@Param("abc")String author);
		
		@Query("SELECT b FROM Book b WHERE b.bookCost > :bookCost OR b.author like :author")
		List<Book> getBooksAuthorCost(String author, Double bookCost);
		
		@Query("SELECT b FROM Book b WHERE b.bookId in (:inputs)")
		List<Book> getBooksIds(List<Integer> inputs);
}
