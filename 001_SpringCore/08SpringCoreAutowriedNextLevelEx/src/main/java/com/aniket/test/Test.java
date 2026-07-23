package com.aniket.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.aniket.config.MyConfig;
import com.aniket.controller.MyController;

public class Test {

	public static void main(String[] args) {
		
		ApplicationContext ac = new AnnotationConfigApplicationContext(MyConfig.class);
		
		MyController mc = ac.getBean("myController",MyController.class);
		
		System.out.println(mc);

		
	}

}
