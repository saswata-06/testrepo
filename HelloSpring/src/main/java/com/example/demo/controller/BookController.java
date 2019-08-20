package com.example.demo.controller;

import java.util.ArrayList;
import java.util.Optional;

import javax.xml.ws.RequestWrapper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Book;
import com.example.demo.repository.BookRepository;

@RestController
public class BookController {
	
	//@Autowired            		//Incase of developing purpose. This connects the BookRepository with database.
	BookRepository repository;
	
	public BookController(BookRepository repository) //For testing purpose... Otherwise this is not there...
	{
		this.repository=repository;
	}
	
	
	@PostMapping("/saveBook")
	public String storeBook(@RequestBody Book b)
	{
		Book s=repository.save(b);
		if(b!=null)
		{
			return "Success";
		}
		else
		{
			return "Failure";
		}
		
	}
	
	@PostMapping("/bookById")
	public Book getBook(@RequestParam Integer id)
	{
		Book b=repository.findById(id).get();
		return b;
	}
	
	@PostMapping("/bookListById")
	public Iterable<Book> getBook()
	{
		Iterable<Book> b=repository.findAll();
		return b;
	}
	
	@PostMapping("/bookByName")
	public Book getBook(@RequestParam String name)
	{
		Book b=repository.findbByName(name);
		return b;
	}
	
	@PostMapping("/allBooks")	//For testing using Stub
	public Iterable<Book> getAllBooks()
	{
		Iterable<Book> i=repository.findAll();
		return i;
	}
	

}
