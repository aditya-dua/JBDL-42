package org.gfg.sb.api.crud.crudapiexample.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.gfg.sb.api.crud.crudapiexample.model.Employee;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

public class EmployeeService {
	
	HashMap<Integer, Employee> empHM = new HashMap<>();
	
	/*5 main functions
	 * 
	 * 1. Get All Employees
	 * 2. Get Employees for an ID
	 * 3. Create a New Employee
	 * 4. Delete an Existing Employee
	 * 5. Update an Employee
	 * 
	 * */
	
	Employee dummy = new Employee();
	
	public Employee getEmployeeById(int id) {
		
		if(empHM.containsKey(id)) {
			return empHM.get(id);
		}
		return dummy;
	}
	
	public List<Employee> getAllEmployees(){
		List<Employee> emplList = new ArrayList<>();
	
		for(int key:empHM.keySet()) {
			emplList.add(empHM.get(key));
		}	
		return emplList;
	}
	
	public String addEmployee(Employee e) {
		empHM.put(e.getId(), e);
		
		return "Employee Added Successfully!";
	}
	
	public Employee createNewEmployee(Employee emp) {
		
		empHM.put(emp.getId(), emp);
		return empHM.get(emp.getId());
	}
	
	public Employee updatewEmployee(Employee emp,int id) {
		emp.setId(id);
		empHM.put(id, emp);
		return empHM.get(emp.getId());
	}
	
	public Employee deleteEmployee(int id) {
		return empHM.remove(id);
		
	}
	
}
