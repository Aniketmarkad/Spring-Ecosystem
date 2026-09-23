package com.aniket.consumer;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
 
import com.aniket.entity.Cart;

@FeignClient("CART-SERVICE")
public interface CartConsumer {

	 @GetMapping("/cart/info")
	    ResponseEntity<String> showMessage(
	            @RequestHeader("MyToken") String token);

	    @GetMapping("/cart/find/{id}")
	    ResponseEntity<Cart> getCartById(
	            @PathVariable("id") Integer id);

	    @PostMapping("/cart/create")
	    ResponseEntity<String> addToCart(
	            @RequestBody Cart cart);
	    
	    @GetMapping("/cart/test")
	    String callCart();
}
