package springProject.di;

public class Address {
	
	private String address;

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	
	public Address() {
		// TODO Auto-generated constructor stub
		// You can read data here!
	}
	
	public void display() {
		System.out.println("Address :"+address);
	}

}
