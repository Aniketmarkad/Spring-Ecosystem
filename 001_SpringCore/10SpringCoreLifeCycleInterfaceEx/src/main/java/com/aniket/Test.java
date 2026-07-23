package com.aniket;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.aniket.MyConfig;

public class Test {
	
	public static void main1(String[] args) {
		AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(MyConfig.class);
		Object ob = ac.getBean("eobj");
		System.out.println(ob);
		ac.close();
	}

	public static void main(String[] args) {
		ClassPathXmlApplicationContext ac = new ClassPathXmlApplicationContext("beans.xml");
		Object ob = ac.getBean("eobj");
		System.out.println(ob);
		ac.close();
	}
}
