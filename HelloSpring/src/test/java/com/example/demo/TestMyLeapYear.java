package com.example.demo;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import org.junit.Test;

import com.example.demo.model.LeapYearCalculator;

public class TestMyLeapYear {

	LeapYearCalculator y= new LeapYearCalculator();
	
	@Test
	public void TestCase1()
	{
		assertEquals(1, y.leap(2016));
	}
	
	@Test
	public void TestCase2()
	{
		assertEquals(0, y.leap(2015));
	}
	
	@Test
	public void TestCase3()
	{
		assertEquals(1, y.leap(2000));
	}
	
	@Test
	public void TestCase4()
	{
		assertNotEquals(1, y.leap(1000));
	}
}
