package FindDuplicatesUsingStreams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class DuplicateInteger {

//	.WAP to find duplicates in a List of Integers using stream api
	public static void main(String[] args) {
		List<Integer> nums = Arrays.asList(1,2,3,2,1,4,5,5);
		
		nums.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))
		.entrySet().stream().filter(n -> n.getValue()>1).map(n->n.getKey()).forEach(n -> System.out.println(n));
	}
}
