import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ListExampleMain {
	
	public static void main(String[] args) {
		
		// Question: What is initial Size of an ArrayList
		List<String> list = new ArrayList<>();
		list.add("Aditya");
		list.add("John");
		list.add("David");
		list.add("Warn");
		list.add("Eagle");
		
		System.out.println(list.size());
		
		System.out.println(list.get(0));
		
		System.out.println("====Iterator in Action ====");
		
		for (Iterator iterator = list.iterator(); iterator.hasNext();) {
			String string = (String) iterator.next();
			System.out.println(string);
			
		}
		
		Collections.sort(list);
		System.out.println("Sorted List ::"+list);
		
		Collections.shuffle(list);
		System.out.println("Shuffled List ::"+list);
		
		ArrayList<String> arrayList = new ArrayList<>(list);
		
		// sort, shuffle, reverse, rotatte
		
	}

}
