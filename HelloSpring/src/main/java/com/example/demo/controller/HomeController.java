package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Person;

@RestController
public class HomeController 
{
	@GetMapping("/hello")
	public String sayHello()
	{
		return "Hello World!!";
	}
	

	@GetMapping("/helloName/{name}")
	public String sayHello(@PathVariable String name)
	{
		return "Hello "+name;
	}
	
	@PostMapping("/square")
	public String getSquare(@RequestParam("num") String number)
	{
		int n=Integer.parseInt(number);
		return "Square:"+(n*n);
	}
	
	@PostMapping("/person")
	public String storePerson(@RequestBody Person p)
	{
		System.out.println(p);
		return p.toString();
	}
	
}
