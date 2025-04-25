package Qs22_DistinctOddNums;

import java.util.Arrays;
import java.util.List;

public class DistinctOddNums {

//	Given a list of integers, write a program to find and print the distinct odd numbers using Java Stream API.
	public static void main(String[] args) {
		List<Integer> nums = Arrays.asList(1,2,3,4,5,6,7,8,9,10,3,5,6,7,9);
		
		nums.stream().filter(n -> n%2!=0).distinct().forEach(System.out::println);
	}
}
