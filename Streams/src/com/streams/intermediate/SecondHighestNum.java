package com.streams.intermediate;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class SecondHighestNum {

//	Given a list of integers, find the second highest number using streams.
	public static void main(String[] args) {
		List<Integer> nums = Arrays.asList(1,2,3,4,26,52,3,1,5,6,7,8,9,3);
		
		int secondHighest = nums.stream().sorted(Comparator.reverseOrder()).toList().get(1);
		
		System.out.println(secondHighest);
	}
}
