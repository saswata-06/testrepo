package com.example.demo;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.Iterator;

import org.junit.Before;
import org.junit.Test;

import com.example.demo.controller.BookController;
import com.example.demo.model.Book;
import com.example.demo.repository.StubBookRepository;

public class TestMyController {

	BookController controller;
	
	@Before
	public void setup()
	{
		controller=new BookController(new StubBookRepository());
	}
	
	@Test
	public void testSingle()
	{
		assertTrue(controller.getBook(new Integer("1")).getName().equals("Tom"));
	}
	
	@Test
	public void testAll()
	{
		Iterator<Book> iterator = controller.getAllBooks().iterator();
		int count=0;
		
		while(iterator.hasNext())
		{
			count++;
		}
			assertEquals(3, count);
	}
	
	
}
