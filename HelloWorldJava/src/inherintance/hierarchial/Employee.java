package inherintance.hierarchial;

public class Employee extends Person {

	int salary;
	String designation;
	
	
	public void display(){
		
		System.out.println("Employee [salary=" + salary + ", designation=" + designation + ", id=" + id + ", name=" + name + "]");
		
	}

	@Override
	public String toString() {
		return "Employee [salary=" + salary + ", designation=" + designation + ", id=" + id + ", name=" + name + "]";
	}
	
	
}
