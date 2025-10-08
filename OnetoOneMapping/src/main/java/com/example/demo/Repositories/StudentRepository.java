package com.example.demo.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.Entities.Student;

public interface StudentRepository extends JpaRepository<Student,Integer> {

}
