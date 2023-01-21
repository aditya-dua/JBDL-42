package org.geeksforgeeks.jbdl.springboothibernateexample.SpringbootWithHibernate.model;

public class GetEmployeeResponseModel {
	
	private int id;
	private String firstName;
	private String lastName;
	private int status;
	
	
	
	
	public GetEmployeeResponseModel(int status) {
		super();
		this.status = status;
	}
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	public GetEmployeeResponseModel(int id, String firstName, String lastName,int status) {
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
	public GetEmployeeResponseModel() {
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
