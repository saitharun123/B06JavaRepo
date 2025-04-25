package Qs11_RemoveDuplicates;

import java.util.Arrays;
import java.util.List;

public class RemoveDuplicates {

//	Write a program to remove all the duplicate elements from a list using Java Stream API.
	public static void main(String[] args) {
		List<Integer> nums = Arrays.asList(1,32,3,4,25,4,2,3,7,32);
		
		nums.stream().distinct().toList().forEach(System.out::println);
	}
}
