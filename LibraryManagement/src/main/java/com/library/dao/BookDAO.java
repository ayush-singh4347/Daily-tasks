package com.library.dao;


import java.util.List;
import com.library.model.Book;

public interface BookDAO {
	 void addBook(Book book);
	    void updateBook(Book book);
	    void deleteBook(int bookId);
	   // Book getBookById(int bookId);
	    List<Book> getAllBooks();
	    Book getBookById(int id); 
}
