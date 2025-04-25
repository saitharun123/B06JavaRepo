package Qs13_IntegersToSquares;

import java.util.Arrays;
import java.util.List;

public class IntegersToSquares {

//	Write a program to convert a list of integers to a list of their squares using Java Stream API
	public static void main(String[] args) {
		List<Integer> nums = Arrays.asList(1,3,4,25,2,7,32);
		
		List<Integer> squares = nums.stream().map(n -> n*n).toList();
		System.out.println(squares);
	}
}
