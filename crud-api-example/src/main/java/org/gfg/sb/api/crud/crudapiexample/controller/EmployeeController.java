package org.gfg.sb.api.crud.crudapiexample.controller;

import java.util.List;

import org.gfg.sb.api.crud.crudapiexample.model.Employee;
import org.gfg.sb.api.crud.crudapiexample.service.EmployeeService;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/employee/")
public class EmployeeController {


	EmployeeService empService = new EmployeeService();
	
	@RequestMapping("test")
	public String testAPI() {
		
		Employee emp = new Employee(1,"ABC",1234);
		Employee emp2 = new Employee(2,"DEF",3467);
		
		empService.addEmployee(emp);
		empService.addEmployee(emp2);
		
		return "API Works!";
	}
	
	@RequestMapping("getById/{id}")
	public Employee getEmployeeById(@PathVariable int id) {
		return empService.getEmployeeById(id);
	}
	
	@RequestMapping("get")
	public List<Employee> getAllEmployees(){
		return empService.getAllEmployees();
	}
	
	@PostMapping("")
	public Employee createNewEmployee(@RequestBody Employee emp) {
		return empService.createNewEmployee(emp);
	}
	
	@PutMapping("/{id}")
	public Employee updatewEmployee(@RequestBody Employee emp,@PathVariable int id) {
		return empService.updatewEmployee(emp,id);
	}
	
	@DeleteMapping("/{id}")
	public Employee deleteEmployee(@PathVariable int id) {
		return empService.deleteEmployee(id);
	}
	
}
