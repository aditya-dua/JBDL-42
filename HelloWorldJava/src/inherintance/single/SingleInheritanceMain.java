package inherintance.single;

public class SingleInheritanceMain {

	public static void main(String[] args) {
		
		Employee emp = new Employee();
		emp.id=1;
		emp.name="Aditya";
		emp.salary=10000;
		emp.designation="Engineer";
		
		emp.display();
		
		Person p = new Person();
		p.id=1;
		p.name="ABC";
		
		p.display();
		
	}
}
