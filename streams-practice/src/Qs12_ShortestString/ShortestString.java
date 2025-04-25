package Qs12_ShortestString;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class ShortestString {

//	Given a list of strings, write a program to find and print the shortest string using Java Stream API.
	public static void main(String[] args) {
		List<String> strList = Arrays.asList("Banana","Pine","Mango","BlueBerries");
		
		String shortString = strList.stream().min(Comparator.comparing(n -> n.length())).get();
		System.out.println(shortString);
	}
}
