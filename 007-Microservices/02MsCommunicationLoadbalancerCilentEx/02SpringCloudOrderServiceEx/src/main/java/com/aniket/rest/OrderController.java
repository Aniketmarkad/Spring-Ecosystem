package com.aniket.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class OrderController {

	 @Autowired
	 private LoadBalancerClient loadBalancerClient;

	 @GetMapping("/order")
	  public String placeOrder() 
	 {

	        // Step 1: Ask Load Balancer to choose one CART-SERVICE instance
	        ServiceInstance instance =
	                loadBalancerClient.choose("CART-SERVICE");


	        // Step 2: Get selected instance URL
	        String url = instance.getUri().toString();


	        // Step 3: Add Cart Service endpoint path
	        url = url + "/cart";


	        // Print selected URL in console
	        System.out.println("Selected Cart Service URL: " + url);

	        
	        RestTemplate restTemplate = new RestTemplate();

	        // Step 4: Call Cart Service using RestTemplate
	        ResponseEntity<String> response =
	                restTemplate.getForEntity(url, String.class);


	        // Step 5: Return Cart Service response to client
	        return "Order Service Response: " + response.getBody();

	    }
}
