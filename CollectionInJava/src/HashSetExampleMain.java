import java.util.HashSet;

public class HashSetExampleMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashSet<String> hs = new HashSet<>();
		
		hs.add("Aditya");
		hs.add("David");
		
		hs.add("Aditya");
		
		System.out.println("Hashset size:"+hs.size());
		
		System.out.println(hs);
	}

}
