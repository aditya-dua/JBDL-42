package org.geeksforgeeks.jbdl.springboothibernateexample.SpringbootWithHibernate.service;

import java.util.List;

import org.geeksforgeeks.jbdl.springboothibernateexample.SpringbootWithHibernate.entity.Employee;
import org.geeksforgeeks.jbdl.springboothibernateexample.SpringbootWithHibernate.model.CreateEmployeeRequestModel;
import org.geeksforgeeks.jbdl.springboothibernateexample.SpringbootWithHibernate.model.CreateEmployeeResponseModel;
import org.geeksforgeeks.jbdl.springboothibernateexample.SpringbootWithHibernate.model.GetEmployeeResponseModel;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

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
	
	public GetEmployeeResponseModel getEmployeeUsingId(int id) {
		Session session = sessionFactory.openSession();
		GetEmployeeResponseModel empModel;
		try {
			Employee emp = session.get(Employee.class, id);
			
			empModel = new GetEmployeeResponseModel(emp.getId(),emp.getFirstName(),emp.getLastName(),200);
			
		}catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			empModel = new GetEmployeeResponseModel(500);

		}
		
		session.close();
		
		return empModel;
		
		
	}
	
	
	public CreateEmployeeResponseModel postEmployee(CreateEmployeeRequestModel emp) {
		Session session = sessionFactory.openSession();
		CreateEmployeeResponseModel response = null;
		Transaction tx;
		try {
			tx = session.beginTransaction();
			Employee e = new Employee(emp.getFirstName(), emp.getLastName());
			session.save(e);
			tx.commit();
			session.close();
			if(e!=null) {
				response = new CreateEmployeeResponseModel(e.getId(), e.getFirstName(), e.getLastName(),200);
			}
		}catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			response = new CreateEmployeeResponseModel(0, emp.getFirstName(), emp.getLastName(),500);

		}
		
		
		
		
		return response;
		
	}

}
