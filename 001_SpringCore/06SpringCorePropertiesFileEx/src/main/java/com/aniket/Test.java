package com.aniket;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {

	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(MyAppConfig.class);
		
		Object obj = ac.getBean("con");
		
		System.out.println(obj);

	}

}
