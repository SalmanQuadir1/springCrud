package com.CrudBoot.web.services;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.CrudBoot.web.dao.BookRepository;
import com.CrudBoot.web.entities.Book;

@Service
public class BookService {

	@Autowired
	private BookRepository bookRepository;

	/*
	 * private static List<Book> list = new ArrayList<>(); static { list.add(new
	 * Book(123, "Java", "Adam")); list.add(new Book(124, "Java II", "joseph"));
	 * list.add(new Book(125, "Java premier", "smith")); }
	 */

	public List<Book> getAllBooks() {

		List<Book> list = (List<Book>) this.bookRepository.findAll();
		return list;
	}

	public Book getBookById(int id) {
		Book book = null;
		try {

			book = this.bookRepository.findById(id);
			/*
			 * book = list.stream().filter(e -> e.getId() == id).findFirst().get();
			 */
		} catch (Exception e) {
			e.printStackTrace();
		}
		return book;
	}

	public Book addBook(Book book) {
		Book book1 = this.bookRepository.save(book);
		return book1;
	}

	public void deleteBookById(int id) {
		/*
		 * list = list.stream().filter(book -> book.getId() !=
		 * id).collect(Collectors.toList());
		 */	
	this.bookRepository.deleteById(id);	
	}

	public void updateBook(Book book, int id) {

		/*list = list.stream().map(b -> {
			if (b.getId() == id) {
				b.setTitle(book.getTitle());
				b.setAuthor(book.getAuthor());

			}
			return b;
		}).collect(Collectors.toList());
	}*/
		book.setId(id);
		this.bookRepository.save(book);
	}
}
