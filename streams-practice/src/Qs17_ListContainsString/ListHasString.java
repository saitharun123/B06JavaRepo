package Qs17_ListContainsString;

import java.util.Arrays;
import java.util.List;

public class ListHasString {

//	Write a program to check if a list of strings contains a specific string using Java Stream API.
	public static void main(String[] args) {
		List<String> strList = Arrays.asList("Banana","Pine","Mango","BlueBerries");
		String matcher = "banana";
		
		boolean isFound = strList.stream().anyMatch(n -> n.equalsIgnoreCase(matcher));
		
		System.out.println(isFound);
	}
}
