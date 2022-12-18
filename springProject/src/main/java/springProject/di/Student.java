package springProject.di;

import java.util.HashMap;
import java.util.HashSet;

public class Student {
	
	private String name;
	private HashSet<Integer> marks;
	private HashMap<String,Integer> marksMap;
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public HashSet<Integer> getMarks() {
		return marks;
	}
	public void setMarks(HashSet<Integer> marks) {
		this.marks = marks;
	}
	
	public HashMap<String, Integer> getMarksMap() {
		return marksMap;
	}
	public void setMarksMap(HashMap<String, Integer> marksMap) {
		this.marksMap = marksMap;
	}
	public void print() {
		System.out.println("Values are:"+marks);
		System.out.println("Values are:"+marksMap);

	}
	

}
