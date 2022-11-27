package inherintance.single;

public class Person {
	
	int id;
	String name;
	
	public Person() {
		// TODO Auto-generated constructor stub
		System.out.println("Person Constructor called.");
	}
	public void display() {
		System.out.println(toString());
	}

	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + "]";
	}
	
	

}
