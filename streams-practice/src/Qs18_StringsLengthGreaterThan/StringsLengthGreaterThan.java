package Qs18_StringsLengthGreaterThan;

import java.util.Arrays;
import java.util.List;

public class StringsLengthGreaterThan {

//	Given a list of strings, write a program to find and print the strings with length greater than a specified value 5 using Java Stream API.
	public static void main(String[] args) {
		List<String> strList = Arrays.asList("Banana","Pine","Mango","BlueBerries","Apple","Anar");
		
		strList.stream().filter(n -> n.length()>5).forEach(System.out::println);
	}
}
