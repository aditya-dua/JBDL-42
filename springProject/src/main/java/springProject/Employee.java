package springProject;

public class Employee {
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
	public void print() {
		System.out.println("Name is: "+name);
	}
	
	public void destroy() {
		System.out.println("Destrol Called");
	}
}
