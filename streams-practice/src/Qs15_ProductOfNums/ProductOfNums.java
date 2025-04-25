package Qs15_ProductOfNums;

import java.util.Arrays;
import java.util.List;

public class ProductOfNums {

//	Write a program to find the product of all elements in a list of integers using Java Stream API.
	public static void main(String[] args) {
		List<Integer> nums = Arrays.asList(1,3,4,2,7);
		
		long product = nums.stream().reduce((c,e)->c*e).get();
		
		System.out.println(product);
	}
}
