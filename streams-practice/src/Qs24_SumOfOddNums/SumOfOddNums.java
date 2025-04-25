package Qs24_SumOfOddNums;

import java.util.Arrays;
import java.util.List;

public class SumOfOddNums {

//	Given a list of integers, write a program to find and print the sum of all odd numbers using Java Stream API.
	public static void main(String[] args) {
		List<Integer> nums = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
		
		long sumOfOdd = nums.stream().filter(n -> n%2!=0).reduce((c,e)->c+e).get();
		System.out.println(sumOfOdd);
	}
}
