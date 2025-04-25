package Qs7_StringsInAlphabeticalOrder;

import java.util.Arrays;
import java.util.List;

public class AlphabeticalOrderOfStrings {

//	Write a program to sort a list of strings in alphabetical order using Java Stream API
	public static void main(String[] args) {
		List<String> strList = Arrays.asList("Banana","Pine","Mango","BlueBerries");
		
		strList.stream().sorted().forEach(System.out::println);
	}
}
