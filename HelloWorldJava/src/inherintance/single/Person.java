package inherintance.single;

public class Person {
	
	int id;
	String name;
	
	public void display() {
		System.out.println(toString());
	}

	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + "]";
	}
	
	

}
