package com.aniket.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.aniket.entity.Student;
import com.aniket.repo.StudentRepository;

@Component
public class TestOprRunner implements CommandLineRunner {

	@Autowired
	private StudentRepository repo;
	
	@Override
	public void run(String... args) throws Exception {
		
		Student sobj = new Student();
		sobj.setStdId(99);
		sobj.setStdName("SAM");
		sobj.setStdFee(20000.0);
		
		repo.save(sobj);
		
		System.out.println("hello aniket work done");

	}

}
