package com.example.demo.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.example.demo.model.Book;

public interface BookRepository extends CrudRepository<Book, Integer> {
	
	@Query("Select b from Book b where name=?1")
	public Book findbByName(String name); //Its an interface so we cant define a method 

}
