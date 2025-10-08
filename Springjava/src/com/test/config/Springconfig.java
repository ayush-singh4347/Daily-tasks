package com.test.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import com.test.model.Employee;

@Configuration
public class Springconfig {
	@Bean
	public Employee empid() {
		
		
		Employee emp=new Employee();
		emp.setId(111);
		emp.setName("Ranit");
		emp.setCity("Mumbai");
		return emp;
	}

}
