import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class HashMapExampleMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashMap<String, String> hm = new HashMap<>();
		
		hm.put("1", "ABC");
		hm.put("2", "DEF");
		hm.put("3", "XYZ");
		
		
		System.out.println("The value is :"+hm.get("1"));
		
		hm.put("1", "QRV");
		
		System.out.println("The value is ::"+hm.get("1"));
		
		
		HashMap<Integer, String> hmMap = new HashMap<>();
		
		hmMap.put(Integer.valueOf(1), "ABC");
		hmMap.put(1, "ABC");
		hmMap.put(Integer.valueOf(2), "DEF");
		hmMap.put(Integer.valueOf(3), "ABC");
		
		hmMap.containsKey(1);
		
		Iterator hmIterator  = hmMap.entrySet().iterator();
		
		while (hmIterator.hasNext()) {
			Map.Entry<Integer, String> object = (Map.Entry<Integer, String>) hmIterator.next();
			
			System.out.println(object.getKey()+"   "+object.getValue());
		}		
		
		System.out.println("The value is ::"+hmMap.get(Integer.valueOf(1)));
		
	}

}
