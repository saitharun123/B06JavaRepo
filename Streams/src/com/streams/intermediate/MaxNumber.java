package com.streams.intermediate;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class MaxNumber {

//	Given a list of integers, find the maximum value using streams.
	public static void main(String[] args) {
		List<Integer> nums = Arrays.asList(1,2,3,4,45,23,54);
		
//		Optional<Integer> maxNum = nums.stream().max((a,b)-> Integer.compare(a,b));
		Optional<Integer> maxNum = nums.stream().max(Integer::compare);
		
		System.out.println(maxNum.get());
	}
}
