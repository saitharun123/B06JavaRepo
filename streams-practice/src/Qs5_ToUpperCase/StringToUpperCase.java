package Qs5_ToUpperCase;

import java.util.Arrays;
import java.util.List;

public class StringToUpperCase {

//	Write a program to convert a list of strings to uppercase using Java Stream API.
	public static void main(String[] args) {
		List<String> strList = Arrays.asList("Banana","Pine","Mango","BlueBerries");
		
		strList.stream().map(n -> n.toUpperCase()).forEach(System.out::println);
	}
}
