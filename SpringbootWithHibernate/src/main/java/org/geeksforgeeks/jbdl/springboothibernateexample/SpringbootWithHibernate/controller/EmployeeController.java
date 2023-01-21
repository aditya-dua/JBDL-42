package org.geeksforgeeks.jbdl.springboothibernateexample.SpringbootWithHibernate.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {

	@RequestMapping("/test")
	public String testAPI() {
		return "Test API Works!";
	}
	
	@RequestMapping("/get/all")
	public void getAllEmployees() {
		
	}
}
