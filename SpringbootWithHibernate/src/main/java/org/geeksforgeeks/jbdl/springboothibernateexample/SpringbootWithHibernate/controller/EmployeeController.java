package org.geeksforgeeks.jbdl.springboothibernateexample.SpringbootWithHibernate.controller;

import java.util.List;

import org.geeksforgeeks.jbdl.springboothibernateexample.SpringbootWithHibernate.entity.Employee;
import org.geeksforgeeks.jbdl.springboothibernateexample.SpringbootWithHibernate.service.EmployeeService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {
	EmployeeService empService = null;
	public EmployeeController() {
		// TODO Auto-generated constructor stub
		empService = new EmployeeService();
	}
	@RequestMapping("/test")
	public String testAPI() {
		return "Test API Works!";
	}
	
	@RequestMapping("/get/all")
	public List<Employee> getAllEmployees() {
		
		return empService.getAllEmployees();
		
	}
}
