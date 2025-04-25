package Qs4_StringsContainingA;

import java.util.Arrays;
import java.util.List;

public class NoOfStringHavingA {

//	Given a list of strings, write a program to count the number of strings containing a specific character ‘a’ using Java Stream API.
	
	public static void main(String[] args) {
		List<String> strList = Arrays.asList("Banana","Pine","Mango","BlueBerries");
		
		long noOfStrings = strList.stream().filter(n -> n.contains("a")).count();
		
		System.out.println(noOfStrings);
	}
}
