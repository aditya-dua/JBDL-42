package org.geeksforgeeks.jbdl.springboothibernateexample.SpringbootWithHibernate.service;

import org.geeksforgeeks.jbdl.springboothibernateexample.SpringbootWithHibernate.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class EmployeeService {
	
	Configuration config;
	SessionFactory sessionFactory;
	
	
	
	public EmployeeService() {
		// TODO Auto-generated constructor stub
		config = new Configuration();
		
		sessionFactory = config.configure("hbm.cfg.xml").buildSessionFactory();
		
	}
	public void getAllEmployees() {
		Session session = sessionFactory.openSession();
		
		Employee emp = session.get(Employee.class, 1);
		
		
		
	}

}
