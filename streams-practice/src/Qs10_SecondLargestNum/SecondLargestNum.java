package Qs10_SecondLargestNum;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SecondLargestNum {

	public static void main(String[] args) {
		List<Integer> nums = Arrays.asList(1,32,3,4,25);
		
		Integer num = nums.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList()).get(1);
		System.out.println(num);
	}
}
