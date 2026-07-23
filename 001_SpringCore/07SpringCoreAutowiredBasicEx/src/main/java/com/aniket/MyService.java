package com.aniket;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import com.aniket.MyRepository;

@Component
public class MyService {

	@Autowired
	private MyRepository repo;
	

	@Override
	public String toString() {
		return "MyService [repo=" + repo + "]";
	}
	
	
}
