package org.geeksforgeeks.jbdl.springboothibernateexample.SpringbootWithHibernate.model;

public class CreateEmployeeRequestModel {
	
	private String firstName;
	private String lastName;
	
	public CreateEmployeeRequestModel(String firstName, String lastName) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
	}
	
	public CreateEmployeeRequestModel() {
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
