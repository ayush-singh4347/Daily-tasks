package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Repositories.LaptopRepository;
import com.example.demo.Repositories.StudentRepository;

@RestController
@RequestMapping("/students")
public class StudentController {
	
	@Autowired
	private StudentRepository studentRepo;
	
	@Autowired
	private LaptopRepository laptopRepo;
	
	//@PostMapping("/add")
	
	//return "Student and Laptop saved successfully!";

}
