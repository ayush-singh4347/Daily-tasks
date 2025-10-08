package com.test.SpringJDBC;
 
import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
 
@Configuration
public class Springconfig {
	
    @Bean
    
    public DriverManagerDataSource myDatasource() {
	DriverManagerDataSource dataSource =new DriverManagerDataSource();
	dataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
	dataSource.setUrl("jdbc:mysql://localhost:3306/mydb");
	dataSource.setUsername("root");
	dataSource.setPassword("Singh@2001");
	return dataSource;
}
    @Bean
    public JdbcTemplate myJdbcTemplate() {
    	JdbcTemplate jdbctemplate = new JdbcTemplate();
    	jdbctemplate.setDataSource(myDatasource());
    	return jdbctemplate;
    }
}
 