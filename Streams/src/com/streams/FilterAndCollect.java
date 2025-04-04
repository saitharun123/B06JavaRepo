package com.streams;

import java.util.Arrays;
import java.util.List;

public class FilterAndCollect {

	//Given a list of strings, 
	//filter out the ones that have a length greater than 5 and collect them into a new list.
	
	public static void main(String[] args) {
		List<String> nums = Arrays.asList("Tharun","Naveen","Sai","ravi","mithun");
		
		List<String> filteredNums = nums.stream()
											.filter(n -> n.length()>5)
											.toList();
		System.out.println(filteredNums.toString());
	}
}
