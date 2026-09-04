package com.aniket.runner;

import org.springframework.boot.CommandLineRunner;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class GetTestARunner implements CommandLineRunner {

	@Override
	public void run(String... args) throws Exception {
		
		//1.Create url
		//String url ="http://localhost:9696/v1/api/book/showA";
		String url ="http://localhost:9696/v1/api/book/showC";
		
		//2. create request header
		//3. create request body
		
		//2+3
		
		//4.create RestTemplate object
		RestTemplate template = new RestTemplate();
		
		//5. make http call and get response back
		ResponseEntity<String> response = template.getForEntity(url,String.class);
		
		//6. print details
		System.out.println(response.getBody());
		System.out.println(response.getHeaders());
		System.out.println(response.getStatusCode());
		System.out.println(response.getStatusCode().value());
		 
	}

}
