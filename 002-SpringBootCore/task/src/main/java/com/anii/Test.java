package com.anii;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class Test implements CommandLineRunner {
	
	@Autowired
	private EmailConfig eobj;

	@Override
	public void run(String... args) throws Exception {
		
		System.out.println(eobj);

	}

}
