package com.aniket.bean.test;

import static org.junit.Assert.assertEquals;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import com.aniket.beans.Calculator;

public class CalculatorTest {

	private static   Calculator Calc = null;
	
	@BeforeClass
	public static void init()
	{
		Calc=new Calculator();
	}
	
	@AfterClass
	public static void destroy()
	{
		Calc = null;
	}
	
	@Test
	public void testAdd()
	{
		Integer actualResult = Calc.add(10, 20);
		Integer expectedResult = 30;
		assertEquals(expectedResult,actualResult);
	}
	@Test
	public void testMultiply()
	{
		Integer actualResult = Calc.Multiply(10, 20);
		Integer expectedResult = 200;
		assertEquals(expectedResult,actualResult);
	}
	
}
