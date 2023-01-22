package org.geeksforgeeks.jbdl42.sbjpaexample.SpringBootJPAExample.controller;

import java.util.List;

import org.geeksforgeeks.jbdl42.sbjpaexample.SpringBootJPAExample.entity.Employee;
import org.geeksforgeeks.jbdl42.sbjpaexample.SpringBootJPAExample.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {

	@Autowired
	private EmployeeRepository employeeRepository;
	
	@RequestMapping("/test")
	public String test(){return "Test API works!";}
	
	@PostMapping("/create")
	public Employee createEmployee(@RequestBody Employee employee){
		return employeeRepository.save(employee);
		
	}
	@RequestMapping("/findAll")
	public List<Employee> findAllEmployees(){return employeeRepository.findAll();}
	
}
