package com.aniket.rest;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.aniket.entity.Book;

@RestController
@RequestMapping("v1/api/book")
public class BookRestController {

	@GetMapping("/showA")
	public ResponseEntity<String> showMsg1()
	{
		return ResponseEntity.ok("welcome");   
	}
	
	@GetMapping("/showB/{id}/{name}")
	public ResponseEntity<String> showMsg2(
			@PathVariable("id") Integer id,
			@PathVariable("name") String name
			)
	{
		return ResponseEntity.ok("welcome to first call type =" +id+"-"+name );   
	}
	
	@GetMapping("/showC")
	public ResponseEntity<Book>showMsg3(){
		return ResponseEntity.ok(new Book(101,"abc","raj",500.0));
	}
	
	@PostMapping("/showD")
	public ResponseEntity<String>showMsg4(
			@RequestBody Book book
			)
	{
		return ResponseEntity.ok("data give is "+ book);
	}
	
	
}

