package com.aniket.test;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

@TestMethodOrder(OrderAnnotation.class)
public class TestEmployee {

	/*@BeforeAll
	public static void setupAll()
	{
		System.out.println("from setupAll");
	}
	@BeforeEach
	public void setup()
	{
		System.out.println("from setup");
	}
	
	*/
	@Test
	@Order(1)
	@Tag("dev")
	public void testSave()
	{
		System.out.println("hello-save");
	}
	
	@Test
	@Order(2)
	@Tag("prod")
	public void testUpdate()
	{
		System.out.println("hello-update");
	}
	
	@Test 
	@Order(3)
	@Tag("prod")
	public void testDelete()
	{
		System.out.println("hello-delete");
	}
	/*
	@AfterEach
	public void clear()
	{
		System.out.println("from clear");
	}
	 
	@AfterAll
	public static void clearAll()
	{
		System.out.println("from clearAll");
	}*/
}
