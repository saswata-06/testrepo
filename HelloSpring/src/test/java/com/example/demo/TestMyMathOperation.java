package com.example.demo;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import org.junit.Test;

import com.example.demo.model.MathOperation;

public class TestMyMathOperation {
	MathOperation mo=new MathOperation();
	
	@Test
	public void TestCase1()
	{
		assertEquals(10, mo.Add(5, 5));
	}
	
	@Test
	public void TestCase2()
	{
		assertNotEquals(5, mo.Add(5, 5));
	}
}
