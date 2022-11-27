package inherintance.single;

public class DifferentObjectDifferentReferenceMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Person p;
		
		
//		System.out.println("Person p = new Person();");
//		p = new Person();
//		
//		System.out.println("Person p = new Employee();");
//		p= new Employee();

//		System.out.println("Employee e = new Employee();");
		Employee e = new Employee();
		
		try {
			e.salary = 0;
			System.out.println("The per day cost of employee is:"+30/e.salary);	
		}catch(Exception exp) {
			exp.printStackTrace();
		}
		
		System.out.println("Hello World!");
		//Employee e1= new Person();

	}

}
