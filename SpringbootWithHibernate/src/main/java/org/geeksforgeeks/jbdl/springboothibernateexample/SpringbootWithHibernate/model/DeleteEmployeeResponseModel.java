package org.geeksforgeeks.jbdl.springboothibernateexample.SpringbootWithHibernate.model;

public class DeleteEmployeeResponseModel {
	
	private int id;
	
	private int status;
	
	
	
	
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public DeleteEmployeeResponseModel() {
		super();
		// TODO Auto-generated constructor stub
	}
	public DeleteEmployeeResponseModel(int id, int status) {
		super();
		this.id = id;
		this.status = status;
	}
	
	
	

}
