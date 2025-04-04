package com.streams.advanced;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

public class DuplicateElements {

//	Given a list of integers, find and collect all the duplicate elements using streams
	public static void main(String[] args) {
		List<Integer> nums = Arrays.asList(1,2,3,4,2,2,3,1,5,6,7,8,9,3);
		
		Set<Integer> seen = new HashSet<>();
		List<Integer> duplicateElements = nums.stream().filter(n -> !seen.add(n)).distinct().toList();
		
		List<Integer> dup = nums.stream()
								.collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))
								.entrySet().stream()
								.filter(n -> n.getValue() > 1)
								.map(Map.Entry::getKey)
								.toList();
								
		System.out.println(duplicateElements.toString());
		System.out.println(dup);
	}
}
