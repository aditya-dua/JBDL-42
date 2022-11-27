package exceptions;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ExceptionHandlingMain {

	public static void main(String[] args) throws InvalidAgeException {
		// TODO Auto-generated method stub
		
		/*
		 * File f = new File("abc.txt");
		 * 
		 * try { System.out.println("In Try Block"); Scanner scanner = new Scanner(f); }
		 * catch (FileNotFoundException e) { // TODO Auto-generated catch block
		 * e.printStackTrace(); } System.out.println("Outside Try Block");
		 */
		
		/*
		 * Employee e = new Employee(); try { e.loadEmployeeFromFile(new
		 * File("abc.txt")); } catch (FileNotFoundException e1) { // TODO Auto-generated
		 * catch block e1.printStackTrace(); }
		 */
		
		/*
		 * try { System.out.println("In try"); throw new Exception("Test Exception"); }
		 * catch (Exception e) { // TODO Auto-generated catch block e.printStackTrace();
		 * } finally { // TODO: handle finally clause
		 * System.out.println("In Finally Block"); }
		 */
		
		Employee e = new Employee();
		
		int age = 20;
		if(age<18) {
			throw new InvalidAgeException("Age cannot be less than 18.");
			
		}else {
			
			e.age = age;
			System.out.println(e);
		}
		
		
		
	}

}
