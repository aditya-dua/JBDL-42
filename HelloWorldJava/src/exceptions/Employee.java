package exceptions;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Employee {
	
	String name;
	int id;
	int age;
	
	public void loadEmployeeFromFile(File f) throws FileNotFoundException {
		
		
		Scanner scanner = new Scanner(f);
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", id=" + id + ", age=" + age + "]";
	}
	

}
