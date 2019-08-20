package com.example.demo.repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import com.example.demo.model.Book;

public class StubBookRepository  implements BookRepository{

	@Override
	public <S extends Book> S save(S entity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends Book> Iterable<S> saveAll(Iterable<S> entities) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Optional<Book> findById(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean existsById(Integer id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Iterable<Book> findAll() {
List<Book> l=new ArrayList<Book>();
		
		Book b1=new Book(1,"Java","ISBN1",20.5f);
		Book b2=new Book(2,"Python","ISBN2",30.5f);
		Book b3=new Book(3,"Ruby","ISBN3",40.5f);
		
		l.add(b1);
		l.add(b2);
		l.add(b3);
		
		return (Iterable<Book>)l;
	}

	@Override
	public Iterable<Book> findAllById(Iterable<Integer> ids) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public long count() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void deleteById(Integer id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(Book entity) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAll(Iterable<? extends Book> entities) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAll() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Book findbByName(String name) {
		// TODO Auto-generated method stub
		return null;
	}
	

}
