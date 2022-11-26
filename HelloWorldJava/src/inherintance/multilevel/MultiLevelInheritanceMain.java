package inherintance.multilevel;



public class MultiLevelInheritanceMain {
	
	public static void main(String[] args) {
		
		
		TraineeEmployee trainee = new TraineeEmployee();
		trainee.id=1;
		trainee.name="Trainee";
		trainee.salary=10000;
		trainee.designation="Engineer";
		trainee.tenure=6;
		
		trainee.display();
		
		Employee emp = new Employee();
		emp.id=2;
		emp.name="Aditya";
		emp.salary=10000;
		emp.designation="Engineer";
		
		emp.display();
		
		Person p = new Person();
		p.id=3;
		p.name="ABC";
		
		p.display();
	}

}
