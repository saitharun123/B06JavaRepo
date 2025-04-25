package Qs1_SumOfElements;

import java.util.Arrays;
import java.util.List;

public class SumOfElements {

	// Write a program to find the sum of all elements in a list using Java Stream API
	public static void main(String[] args) {
		List<Integer> nums = Arrays.asList(1,2,23,25);
		
		Integer sum = nums.stream().reduce(0, (c,e)->c+e);
		System.out.println(sum);
	}
}
