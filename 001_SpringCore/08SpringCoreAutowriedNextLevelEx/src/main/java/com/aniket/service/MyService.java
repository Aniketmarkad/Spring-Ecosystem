package com.aniket.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class MyService {

	@Value("SampleCode")
	private String code;

	@Override
	public String toString() {
		return "MyService [code=" + code + "]";
	}
	
	
}
