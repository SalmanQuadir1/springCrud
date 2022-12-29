package com.CrudBoot.web.dao;

import org.springframework.data.repository.CrudRepository;

import com.CrudBoot.web.entities.Book;

public interface BookRepository extends CrudRepository<Book, Integer> {

	public Book findById(int id);
}
