package org.gfg.sb.api.crud.crudapiexample.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

	List<String> nameList = new ArrayList<>();
	
	@RequestMapping("/")
	public String test() {
		return "API Server is running!";
	}
	
	@RequestMapping("/message/{name}")
	public String message(@PathVariable String name) {
		return "Hello "+name+" !";
	}
	
	@RequestMapping("/load")
	public String load() {
		
		nameList = new ArrayList<>();
		nameList.add("David");
		nameList.add("John");
		nameList.add("Vikas");
		nameList.add("Ron");
		nameList.add("Anand");
		nameList.add("Others");
		
		
		return "Load Successful!";
	}
	
	@RequestMapping("/dynamic-message/{id}")
	public String message(@PathVariable int id) {
		return "Hello "+nameList.get(id)+" !";
	}
	
	@RequestMapping("/add/{name}")
	public String addName(@PathVariable String name) {
		
		nameList.add(name);
		return name+" is added successfully!";
		
	}
	
	@RequestMapping("/getAllNames")
	public List<String> getAllNames() {
		
		nameList.add("David");
		nameList.add("John");
		nameList.add("Vikas");
		nameList.add("Ron");
		nameList.add("Anand");
		nameList.add("Others");
		
		
		return nameList;
	}
	
	
}
