package com.aniket.rest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CartController {

    @Value("${server.port}")
    private String port;

    @GetMapping("/cart")
    public String getCart() {

        return "Response from Cart Service running on Port: " + port;

    }

}
