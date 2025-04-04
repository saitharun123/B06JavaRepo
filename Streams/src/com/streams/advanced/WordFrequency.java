package com.streams.advanced;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class WordFrequency {

//	Given a list of words, count the frequency of each word using streams 
//	and collect it into a Map<String, Integer>.
	public static void main(String[] args) {
		
		List<String> words = Arrays.asList("Apple","Kiwi","Banana","banana","Mango","apple","muskmelon");

		Map<String, Long> map = words.stream().map(n -> n.toLowerCase())
									.collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
								
		System.out.println(map.toString());
	}
}
