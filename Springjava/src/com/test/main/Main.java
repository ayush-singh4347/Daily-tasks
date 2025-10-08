package com.test.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import com.test.config.Springconfig;
import com.test.model.Employee;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context=new AnnotationConfigApplicationContext(Springconfig.class);
		Employee emp=(Employee)context.getBean("empid");
		emp.display();
	}

}
