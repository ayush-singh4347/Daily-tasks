package com.library.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import com.library.config.LibraryConfig;
import com.library.dao.BookDAO;
import com.library.model.Book;
import java.util.List;

public class App {
    public static void main(String[] args) {
        // 1. Start Spring Context
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(LibraryConfig.class);

        // 2. Get BookDAO bean from Spring
        BookDAO bookDAO = context.getBean(BookDAO.class);

        // 3. Insert a new book
//        Book newBook = new Book();
//        newBook.setTitle("The Alchemist");
//        newBook.setAuthor("Paulo Coelho");
//        newBook.setAvailable(true);
//        bookDAO.addBook(newBook);

        //System.out.println("✅ Book inserted successfully!");

        // 4. Fetch all books
        List<Book> books = bookDAO.getAllBooks();
        System.out.println("\n📚 Books in Library:");
        for (Book book : books) {
            System.out.println(book.getBookId() + " | " + book.getTitle() +
                    " | " + book.getAuthor() +
                    " | Available: " + book.isAvailable());
        }

        // 5. Close context
        context.close();
    }
}
