package com.library.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import com.library.model.Book;

public class BookDAOImpl implements BookDAO {

    private JdbcTemplate jdbcTemplate;

    // Constructor injection (we’ll pass JdbcTemplate from config)
    public BookDAOImpl(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    // Insert a row into books table
    @Override
    public void addBook(Book book) {
        String sql = "INSERT INTO books (title, author, available) VALUES (?, ?, ?)";
        jdbcTemplate.update(sql, book.getTitle(), book.getAuthor(), book.isAvailable());
    }

    // Fetch all rows from books table
    @Override
    public Book getBookById(int id) {
        String sql = "SELECT * FROM books";
        return (Book) jdbcTemplate.query(sql, new RowMapper<Book>() {
            @Override
            public Book mapRow(ResultSet rs, int rowNum) throws SQLException {
                Book book = new Book();
                book.setBookId(rs.getInt("id"));
                book.setTitle(rs.getString("title"));
                book.setAuthor(rs.getString("author"));
                book.setAvailable(rs.getBoolean("available"));
                return book;
            }
        });
    }

//	@Override
//	public void updateBook(Book book) {
//		// TODO Auto-generated method stub
//		
//	}
//
//	@Override
//	public void deleteBook(int bookId) {
//		// TODO Auto-generated method stub
//		
//	}

	@Override
	public List<Book> getAllBooks() {
		// TODO Auto-generated method stub
		String sql = "SELECT * FROM books";
        return (List<Book>) jdbcTemplate.query(sql, new RowMapper<Book>() {
            @Override
            public Book mapRow(ResultSet rs, int rowNum) throws SQLException {
                Book book = new Book();
                book.setBookId(rs.getInt("book_id"));
                book.setTitle(rs.getString("title"));
                book.setAuthor(rs.getString("author"));
                book.setAvailable(rs.getBoolean("available"));
                return book;
            }
        });
	}
}
