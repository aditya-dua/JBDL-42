package org.geeksforgeeks.jbdl.springboothibernateexample.SpringbootWithHibernate.model;

public class CreateEmployeeResponseModel {
	
	private int id;
	private String firstName;
	private String lastName;
	private int status;
	
	
	
	
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	public CreateEmployeeResponseModel(int id, String firstName, String lastName,int status) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.status=status;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public CreateEmployeeResponseModel() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	

}
