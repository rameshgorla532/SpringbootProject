package com.example.demo.entity.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Employee;

@RestController
@RequestMapping("/employee")
public class EmployeeController {
	@GetMapping("/emp")
	public ResponseEntity<Employee> getEmployee(){
		return new ResponseEntity<Employee>(new Employee(10,"Ramesh",10.9),HttpStatus.OK);
	}
	@PostMapping("/save")
	public ResponseEntity<String> save1(@RequestBody Employee employee)
	{
		return new ResponseEntity<String>(employee.toString(),HttpStatus.OK);
	}
	

}
