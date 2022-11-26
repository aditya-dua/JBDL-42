package inherintance.multilevel;

public class Employee extends Person {

	int salary;
	String designation;
	
	
	public void display(){
		
		System.out.println(this.toString());
		
	}

	@Override
	public String toString() {
		return "Employee [salary=" + salary + ", designation=" + designation + ", id=" + id + ", name=" + name + "]";
	}
	
	
}
