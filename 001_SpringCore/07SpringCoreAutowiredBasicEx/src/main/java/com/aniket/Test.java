package com.aniket;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import com.aniket.MyConfig;

public class Test {

	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(MyConfig.class);
		
		Object obj = ac.getBean("myService");
		
		System.out.println(obj);

	}

}
