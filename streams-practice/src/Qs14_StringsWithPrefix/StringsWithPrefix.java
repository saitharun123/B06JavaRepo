package Qs14_StringsWithPrefix;

import java.util.Arrays;
import java.util.List;

public class StringsWithPrefix {

//	Given a list of strings, write a program to find and print the strings starting with a specific prefix ‘a’ using Java Stream API.
	public static void main(String[] args) {
		List<String> strList = Arrays.asList("Banana","Pine","Mango","BlueBerries","Apple","Anar");
		
		strList.stream().map(n -> n.toLowerCase()).filter(n -> n.startsWith("a")).forEach(System.out::println);
		
	}
}
