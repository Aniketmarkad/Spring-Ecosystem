package com.aniket.service;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;

@Service
public class OrderService {

    private final RestTemplate restTemplate;

    public OrderService(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    @CircuitBreaker(
        name = "cartService",
        fallbackMethod = "cartFallback"
    )
    public String getCartInfo() {

        System.out.println("Calling CART-SERVICE");

        return restTemplate.getForObject(
            "http://localhost:8086/cart/info",
            String.class
        );
    }

    public String cartFallback(Throwable ex) {

        System.out.println(
            "Fallback executed: " + ex.getMessage()
        );

        return "Cart service is temporarily unavailable";
    }
}