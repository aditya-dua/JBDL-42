package springProject.di;

public class Employee {
	private String name;
	private Address address;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
	
	public Employee(Address address) {
		super();
		this.address = address;
	}

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public void print() {
		System.out.println("Name is: "+name);
		System.out.println("Address is: "+address);
	}
	
	public void destroy() {
		System.out.println("Destrol Called");
	}
}
