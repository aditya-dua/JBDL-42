import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StreamsExampleMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Integer> number = Arrays.asList(1,2,3);
		
		Collections.sort(number);
		List<Integer> square = number.stream()
				.map(x->x*x)
				.sorted(Comparator.reverseOrder())
				.collect(Collectors.toList());
		
		int result = number.stream()
				.map(x->x*x)
				.sorted(Comparator.reverseOrder())
				.reduce(0,(sub,tot)-> tot +sub);
		
		System.out.println("The average is :"+result/number.size());
		
		//System.out.println(square);
		
		
		List<Integer> sortedList = number.stream()
				.sorted()
				.collect(Collectors.toList());
		
		System.out.println(sortedList);
		
		
		
	}

}
