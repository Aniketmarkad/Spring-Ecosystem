package com.aniket.rest;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.aniket.entity.Role;
import com.aniket.entity.User;

@RestController
@RequestMapping("/user")
public class UserRestController {

	@GetMapping("/one")
	public ResponseEntity<User> getOneObj()
	{
		User ob = new User(101,"ABC","dev",
				Set.of("p1","p2"),
				Map.of("m1","aa","m2","ab")
				);
		
		ResponseEntity<User> response = new ResponseEntity<>(ob,HttpStatus.OK);
		return response;
	}
	
	@GetMapping("/list")
	public ResponseEntity<List<Role>> getAllRoles()
	{
		List<Role> roles = Arrays.asList(
				
				new Role(1100,"ADMIN"),
				new Role(1102,"BA"),
				new Role(1103,"QA")
				);
		
		ResponseEntity<List<Role>> response = new ResponseEntity<>(roles,HttpStatus.OK);
		return response;
	}
}
;