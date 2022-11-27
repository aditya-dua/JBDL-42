
public class Student {

	String name;
	int roll;
	String phone;
	
	public Student() {
		// TODO Auto-generated constructor stub
	}

	
	public Student(String name, int roll, String phone) {
		super();
		this.name = name;
		this.roll = roll;
		this.phone = phone;
	}


	@Override
	public String toString() {
		return "Student [name=" + name + ", roll=" + roll + ", phone=" + phone + "]";
	}
	
	
}
