package com.aniket.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.aniket.bean.Book;

@Controller
@RequestMapping("/book")
public class BookController {
	
	@GetMapping("/data")
	public String showData(Model model) 
	{
		Book b1 = new Book(101,"core java","aniket",200.0);
		
		model.addAttribute("bobj",b1);
		
		return "BookData";
	}
	
	@GetMapping("/list")
	public String  showColl (Model model)
	{
		List<Book> list = Arrays.asList(
				new Book(10,"aa","xyz",200.0),
				new Book(11,"bb","xyz",300.0),
				new Book(12,"cc","bdz",400.0),
				new Book(13,"dd","mnz",500.0)
				);
		
		model.addAttribute("list",list);

		return "BookList";
	}

}
