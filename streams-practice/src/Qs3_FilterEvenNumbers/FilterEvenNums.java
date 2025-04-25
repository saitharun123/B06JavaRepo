package Qs3_FilterEvenNumbers;

import java.util.Arrays;
import java.util.List;

public class FilterEvenNums {

//	Write a program to filter out all the even numbers from a list using Java Stream API
	public static void main(String[] args) {
		List<Integer> nums = Arrays.asList(1,32,3,4,25);
		
		nums.stream().filter(n -> n%2==0).forEach(System.out::println);
	}
}
