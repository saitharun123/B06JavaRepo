package com.streams.intermediate;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class SortAndLimit {
//	Given a list of integers, sort them in descending order and return the top 3 elements.
	public static void main(String[] args) {
		List<Integer> nums = Arrays.asList(1,2,3,4,45,23,54);
		
		List<Integer> sortNum = nums.stream().sorted(Comparator.reverseOrder()).limit(3).toList();
		
		System.out.println(sortNum);
	}
}
