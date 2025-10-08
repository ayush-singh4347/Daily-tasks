package com.example.demo.controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Employee;

@RestController
@RequestMapping("/employees")
public class EmployeeController {
	private List<Employee> employees=new ArrayList<>(Arrays.asList(
			new Employee(1,"Ayush","IT"),
			new Employee(2,"Ram","HR")) 
			);
	
	//GET -Fetch all Employee
	@GetMapping
	public List<Employee> getAllEmployees(){
		return employees;
	}
	
	//GET -Fetch all Employee by ID
	@GetMapping("/{id}")
	public Employee getEmployeeById(@PathVariable int id) {
		return employees.stream()
				.filter(e->e.getId()==id)
				.findFirst()
				.orElse(null);
	}
	
	//POST -Add new Employee
	@PostMapping
	public String addEmployee(@RequestBody Employee employee) {
		employees.add(employee);
		return "Employee added successfully";
	}
	//POST -update employee
	@PutMapping("/{id}")
	public String updateEmployee(@PathVariable int id,@RequestBody Employee newEmp) {
		for(Employee e: employees) {
			if(e.getId()==id) {
				e.setName(newEmp.getName());
				e.setDepartment(newEmp.getDepartment());
				return "updated succesfully";
						
			}
		}
		return "Employee Not found";
	}
	// DELETE - Remove employee
    @DeleteMapping("/{id}")
    public String deleteEmployee(@PathVariable int id) {
        employees.removeIf(e -> e.getId() == id);
        return "Employee deleted!";
    }

}
