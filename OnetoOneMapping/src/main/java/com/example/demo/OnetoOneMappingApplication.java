package com.example.demo;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.Entities.Laptop;
import com.example.demo.Entities.Student;
import com.example.demo.Repositories.StudentRepository;

@SpringBootApplication
public class OnetoOneMappingApplication implements CommandLineRunner {
	
	@Autowired
    private StudentRepository studentRepository;
	
	public static void main(String[] args) {
		SpringApplication.run(OnetoOneMappingApplication.class, args);
	}
	
	@Override
	public void run(String... args)throws Exception{
		Student student=new Student();
		student.setStudentId(123);
		student.setStudName("Ayush");
		student.setAbout("SE");
	
		
		
		Laptop laptop =new Laptop();
		laptop.setLaptopId(12);
		laptop.setBrand("hp");
		laptop.setModelno(456);
		laptop.setStudent(student);
		
		student.setLaptop(laptop);
		
		studentRepository.save(student);
		
		//logger.info("save student: {}",save.getStudName());
		
	}

}
