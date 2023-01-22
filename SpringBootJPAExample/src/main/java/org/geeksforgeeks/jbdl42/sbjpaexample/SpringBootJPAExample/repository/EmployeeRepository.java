package org.geeksforgeeks.jbdl42.sbjpaexample.SpringBootJPAExample.repository;

import org.geeksforgeeks.jbdl42.sbjpaexample.SpringBootJPAExample.entity.Employee;
import org.springframework.data.jpa.repository.support.JpaEntityInformation;
import org.springframework.data.jpa.repository.support.SimpleJpaRepository;
import org.springframework.stereotype.Repository;

import jakarta.persistence.EntityManager;

@Repository
public class EmployeeRepository extends SimpleJpaRepository<Employee, Integer>{

	public EmployeeRepository(Class<Employee> domainClass, EntityManager em) {
		super(domainClass, em);
		// TODO Auto-generated constructor stub
	}

	public EmployeeRepository(JpaEntityInformation<Employee, ?> entityInformation, EntityManager entityManager) {
		super(entityInformation, entityManager);
		// TODO Auto-generated constructor stub
	}
	
	

	
}
