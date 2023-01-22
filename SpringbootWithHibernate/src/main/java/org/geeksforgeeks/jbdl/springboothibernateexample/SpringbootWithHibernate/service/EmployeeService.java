package org.geeksforgeeks.jbdl.springboothibernateexample.SpringbootWithHibernate.service;

import java.util.List;

import org.geeksforgeeks.jbdl.springboothibernateexample.SpringbootWithHibernate.entity.Employee;
import org.geeksforgeeks.jbdl.springboothibernateexample.SpringbootWithHibernate.model.CreateEmployeeRequestModel;
import org.geeksforgeeks.jbdl.springboothibernateexample.SpringbootWithHibernate.model.CreateEmployeeResponseModel;
import org.geeksforgeeks.jbdl.springboothibernateexample.SpringbootWithHibernate.model.DeleteEmployeeResponseModel;
import org.geeksforgeeks.jbdl.springboothibernateexample.SpringbootWithHibernate.model.GetEmployeeResponseModel;
import org.geeksforgeeks.jbdl.springboothibernateexample.SpringbootWithHibernate.model.UpdateEmployeeRequestModel;
import org.geeksforgeeks.jbdl.springboothibernateexample.SpringbootWithHibernate.model.UpdateEmployeeResponseModel;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.springframework.web.bind.annotation.PathVariable;
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
		all.orderBy(cb.asc(rootEntry.get("firstName")));
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
	@PostMapping("/post/{id}")
	public UpdateEmployeeResponseModel updateEmployee(@RequestBody UpdateEmployeeRequestModel emp,@PathVariable int id) {
		
		Session session = sessionFactory.openSession();
		UpdateEmployeeResponseModel response = null;
		Transaction tx;
		try {
			tx = session.beginTransaction();
			Employee e = new Employee(emp.getFirstName(), emp.getLastName());
			// Your update logic will go over here!
			
			tx.commit();
			session.close();
			if(e!=null) {
				response = new UpdateEmployeeResponseModel(e.getId(), e.getFirstName(), e.getLastName(),200);
			}
		}catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			response = new UpdateEmployeeResponseModel(0, emp.getFirstName(), emp.getLastName(),500);

		}
		
		return response;
		
	}
	
	@PostMapping("/delete/{id}")
	public DeleteEmployeeResponseModel deleteEmployee(@PathVariable int id) {	
		Session session = sessionFactory.openSession();
		DeleteEmployeeResponseModel response = null;
		Transaction tx;
		try {
			tx = session.beginTransaction();
			
			// Your delete logic will go over here!
			response = new DeleteEmployeeResponseModel(id,200);
			tx.commit();
			session.close();
			
		}catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			response = new DeleteEmployeeResponseModel(0,500);

		}
		
		return response;
		
	}
	
	

}
