package Qs9_LongestString;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class LongestString {

//	Write a program to find the longest string in a list of strings using Java Stream API.
	public static void main(String[] args) {
		List<String> strList = Arrays.asList("Banana","Pine","Mango","BlueBerries");
		
		String longestString = strList.stream().max(Comparator.comparing(n -> n.length())).get();
						
				System.out.println(longestString);	
	
	}
}
