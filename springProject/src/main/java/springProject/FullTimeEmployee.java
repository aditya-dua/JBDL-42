package springProject;

public class FullTimeEmployee extends Employee{
	private String des;
	
	public String getDes() {
		return des;
	}

	public void setDes(String des) {
		this.des = des;
	}

	public void print() {
		System.out.println("Designation is: "+des);
	}
}
