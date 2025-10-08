package com.library.config;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import com.library.dao.BookDAO;
import com.library.dao.BookDAOImpl;


@Configuration
public class LibraryConfig {

    // 1. DataSource Bean (DB Connection)
	@Bean
	public DataSource dataSource() {
		DriverManagerDataSource ds= new DriverManagerDataSource();
		ds.setDriverClassName("com.mysql.cj.jdbc.Driver");
		ds.setUrl("jdbc:mysql://localhost:3306/LibraryDB");
		ds.setUsername("root");
		ds.setPassword("Singh@2001");
		return ds;
	}
	
	@Bean
	public JdbcTemplate jdbcTemplate(DataSource datasource) {
		return new JdbcTemplate(datasource);
	}
	@Bean
	public BookDAO bookDAO(JdbcTemplate jdbcTemplate) {
	    return new BookDAOImpl(jdbcTemplate);
	}

}
