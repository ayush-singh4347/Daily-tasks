package com.test.SpringJDBC;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext context= new AnnotationConfigApplicationContext(Springconfig.class);
    	JdbcTemplate jdbcTemplate= context.getBean(JdbcTemplate.class);
//        String sql = "INSERT INTO tbl VALUES('Ayush','Singh')";
//        int count =jdbcTemplate.update(sql);
//        if(count>0) {
//        	System.out.println("Insertion Success");
//        }
//        else {
//        	System.out.println("Failed Insertion");
//        }
    	String sql = "SELECT * FROM tbl";

    	List<Person> people = jdbcTemplate.query(sql, (rs, rowNum) -> {
    	    Person p = new Person();
    	    p.setid(rs.getInt("id"));
    	    p.setFirstName(rs.getString("first_name"));
    	    p.setLastName(rs.getString("last_name"));
    	    return p;
    	});

    	people.forEach(System.out::println);

        
    }
}
