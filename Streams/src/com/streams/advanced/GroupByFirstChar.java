package com.streams.advanced;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupByFirstChar {

//	Given a list of words, group them by their first character using Collectors.groupingBy().
	
	public static void main(String[] args) {
		List<String> str = Arrays.asList("Apple","Kiwi","Banana","strawberry","Mango","Anar","muskmelon");
		
		Map<Object, List<String>> map = str.stream().collect(Collectors.groupingBy(n->n.charAt(0)));
//		Map<Object, List<String>> map = str.stream().map(n -> n.substring(0,1).toUpperCase().concat(n.substring(1))).collect(Collectors.groupingBy(n->n.charAt(0)));
		
		System.out.println(map.toString());
	}
}
