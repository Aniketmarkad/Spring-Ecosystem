package com.aniket.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/cart")
public class CartRestController {

    @GetMapping("/info")
    public String getCartInfo() {
        return "Cart contains Laptop and Mouse";
    }
}