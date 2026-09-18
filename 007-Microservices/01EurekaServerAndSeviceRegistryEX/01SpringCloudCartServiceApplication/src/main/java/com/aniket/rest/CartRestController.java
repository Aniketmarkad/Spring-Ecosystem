package com.aniket.rest;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/api/cart")
public class CartRestController {

	@GetMapping("/show")
	public ResponseEntity<String> showMessage()
	{
		return ResponseEntity.ok("WELCOME TO SPRING CLOUD");
	}

}

