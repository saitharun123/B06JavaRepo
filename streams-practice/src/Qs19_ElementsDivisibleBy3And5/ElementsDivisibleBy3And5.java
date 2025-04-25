package Qs19_ElementsDivisibleBy3And5;

import java.util.Arrays;
import java.util.List;

public class ElementsDivisibleBy3And5 {

//	Write a program to filter out all the elements divisible by 3 and 5 from a list of integers using Java Stream API.
	public static void main(String[] args) {
		List<Integer> nums = Arrays.asList(1,3,4,25,75,15,7,5);
		
		nums.stream().filter(n -> n%3==0 && n%5==0).forEach(System.out::println);
	}
}
