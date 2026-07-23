package com.aniket;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext ac = new ClassPathXmlApplicationContext("bean.xml");
		Object ob = ac.getBean("eobj");
		System.out.println(ob);
		ac.close();
	}
}
 
