import java.util.ArrayList;
import java.util.Collections;

public class GenericListExampleMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Student> list = new ArrayList<>();
		
		Student s;
		for (int i = 0; i < 5; i++) {
			s=new Student("Student "+i, i+1, "Phone:"+i);
			list.add(s);
			
		}
		
		System.out.println(list);
		
		Collections.shuffle(list);
		
		System.out.println(list);
		
	}

}
