package com.aniket.rest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
//import org.apache.logging.log4j.LogManager;
//import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.aniket.service.IGreateService;

@RestController
public class GreetingsController {

	 
	//private static final Logger log = LogManager.getLogger(GreetingsController.class);
	private static final Logger log = LoggerFactory.getLogger(GreetingsController.class);
	
	    @Autowired
	    private IGreateService service;

	    @GetMapping("/api1")
	    public ResponseEntity<String> generateGreetings() {
	      	
	    	log.trace("Control in api");
	             String body = service.generateWishes();
	         
	        log.debug("service logic is been invoke and we are in rest"); 
	        return new ResponseEntity<String>(body, HttpStatus.OK);
	    }   
}
 