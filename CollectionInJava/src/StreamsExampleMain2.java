import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StreamsExampleMain2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Integer> example = Arrays.asList(5, 8, 3, 9, 1, 2, 4, 7);

        List<Integer> cubes = example.stream().map(x->x*x*x).sorted().collect(Collectors.toList());
        System.out.println(cubes);
		List<Integer> number = Arrays.asList(6,9,1,3,5,2,4,8,7);
		
		List<Integer> square = number.stream()
				.map(x->x*x)
				.sorted(Comparator.reverseOrder())
				.collect(Collectors.toList());
		
		System.out.println(square);
		
		
		List<Integer> sortedList = number.stream()
				.sorted()
				.collect(Collectors.toList());
		
		System.out.println(sortedList);
		
		
		
	}

}
