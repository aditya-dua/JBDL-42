package org.geeksforgeeks.jbdl.springboothibernateexample.SpringbootWithHibernate.controller;

import java.util.List;

import org.geeksforgeeks.jbdl.springboothibernateexample.SpringbootWithHibernate.entity.Employee;
import org.geeksforgeeks.jbdl.springboothibernateexample.SpringbootWithHibernate.model.CreateEmployeeRequestModel;
import org.geeksforgeeks.jbdl.springboothibernateexample.SpringbootWithHibernate.model.CreateEmployeeResponseModel;
import org.geeksforgeeks.jbdl.springboothibernateexample.SpringbootWithHibernate.model.GetEmployeeResponseModel;
import org.geeksforgeeks.jbdl.springboothibernateexample.SpringbootWithHibernate.service.EmployeeService;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/employee")
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
	
	@RequestMapping("/get/{id}")
	public GetEmployeeResponseModel getEmployeeUsingId(@PathVariable int id) {
		
		return empService.getEmployeeUsingId(id);
		
	}
	
	@PostMapping("/post")
	public CreateEmployeeResponseModel postEmployee(@RequestBody CreateEmployeeRequestModel emp) {
		
		return empService.postEmployee(emp);
		
	}
}
