package com.aniket;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		
		ApplicationContext ac = new ClassPathXmlApplicationContext("beans.xml");
		
		Token tobj1 = ac.getBean("t1",Token.class);
		System.out.println(tobj1.hashCode());
		
		Token tobj2 = ac.getBean("t1",Token.class);
		System.out.println(tobj2.hashCode());
	}

}
