package inherintance.single;

public class Employee extends Person {

	int salary;
	String designation;
	
	public Employee() {
		// TODO Auto-generated constructor stub
		System.out.println("Employee Constructor Called!" );
	}
	
	public void display(){
		
		System.out.println(this.toString());
		
	}

	@Override
	public String toString() {
		return "Employee [salary=" + salary + ", designation=" + designation + ", id=" + id + ", name=" + name + "]";
	}
	
	
}
