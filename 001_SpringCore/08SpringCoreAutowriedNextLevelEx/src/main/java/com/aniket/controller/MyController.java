package com.aniket.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.aniket.service.*;

@Component
public class MyController {
	
	@Autowired(required = false)
	private MyService service;

	@Override
	public String toString() {
		return "MyController [service=" + service + "]";
	}

	
	
	
	
	

}
