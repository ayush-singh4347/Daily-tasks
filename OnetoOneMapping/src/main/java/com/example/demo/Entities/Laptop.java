package com.example.demo.Entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;


@Entity
@Table(name="jpa_laptops")
public class Laptop {
	@Id
	private int laptopId;
	private int modelno;
	private String brand;
	public int getLaptopId() {
		return laptopId;
	}
	public void setLaptopId(int laptopId) {
		this.laptopId = laptopId;
	}
	public int getModelno() {
		return modelno;
	}
	public void setModelno(int i) {
		this.modelno = i;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	
	@OneToOne
	@JoinColumn(name="student_student_id")
	private Student student;

public Student getStudent() {
    return student;
}

public void setStudent(Student student) {
    this.student = student;
}
}
