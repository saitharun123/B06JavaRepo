package com.streams.advanced;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class JoinStrings {

//	Given a list of words, concatenate them into a single string, separated by commas.
	public static void main(String[] args) {
		
		List<String> words = Arrays.asList("Apple","Kiwi","Banana","strawberry","Mango","Anar","muskmelon");
		
		Optional<String> word = words.stream().reduce((a,b) -> a+","+b);

		System.out.println(word.get());
	}

}
