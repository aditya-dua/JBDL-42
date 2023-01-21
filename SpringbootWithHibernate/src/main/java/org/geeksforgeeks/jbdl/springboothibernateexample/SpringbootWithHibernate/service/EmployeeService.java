package org.geeksforgeeks.jbdl.springboothibernateexample.SpringbootWithHibernate.service;

import java.util.List;

import org.geeksforgeeks.jbdl.springboothibernateexample.SpringbootWithHibernate.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import jakarta.persistence.TypedQuery;
import jakarta.persistence.criteria.CriteriaBuilder;
import jakarta.persistence.criteria.CriteriaQuery;
import jakarta.persistence.criteria.Root;

public class EmployeeService {
	
	Configuration config;
	SessionFactory sessionFactory;
	
	
	
	public EmployeeService() {
		// TODO Auto-generated constructor stub
		config = new Configuration();
		
		sessionFactory = config.configure("hbm.cfg.xml").buildSessionFactory();
		
	}
	public List<Employee> getAllEmployees() {
		Session session = sessionFactory.openSession();
		
		CriteriaBuilder cb = session.getCriteriaBuilder();
		CriteriaQuery<Employee> cqEmp = cb.createQuery(Employee.class);
		Root<Employee> rootEntry = cqEmp.from(Employee.class);
		CriteriaQuery<Employee> all = cqEmp.select(rootEntry);
		
		TypedQuery<Employee> allQuery = session.createQuery(all);
		
		
		return allQuery.getResultList();
		
		
	}

}
