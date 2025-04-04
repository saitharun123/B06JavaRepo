package com.streams;

import java.util.Arrays;
import java.util.List;

public class SumOfSquares {

	//Given a list of integers, use streams to compute the sum of their squares.
	public static void main(String[] args) {
		List<Integer> nums = Arrays.asList(1,24,15,10,5);
		
		List<Integer> sumOfSquares = nums.stream()
											.map(n -> n*n).toList();
		
		System.out.println(sumOfSquares.toString());
	}
}
