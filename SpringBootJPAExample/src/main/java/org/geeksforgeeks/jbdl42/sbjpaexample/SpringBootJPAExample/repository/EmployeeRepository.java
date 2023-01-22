package org.geeksforgeeks.jbdl42.sbjpaexample.SpringBootJPAExample.repository;

import org.geeksforgeeks.jbdl42.sbjpaexample.SpringBootJPAExample.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Integer>{

}