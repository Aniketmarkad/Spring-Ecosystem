package com.aniket.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/prod")
public class ProductContoller {
	
	@GetMapping("/data")
	public String ShowProdcut()
	{
		return "ProdData";
	}

}
