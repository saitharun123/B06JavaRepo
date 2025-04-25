package Qs8_ConcatStrings;

import java.util.Arrays;
import java.util.List;

public class ConcatenateStrings {

//	Given a list of strings, write a program to concatenate all the strings using Java Stream API.
	
	public static void main(String[] args) {
		List<String> strList = Arrays.asList("Banana","Pine","Mango","BlueBerries");
		
		String result = strList.stream().reduce((c,e) -> c.concat(e)).get();
		System.out.println(result);
	}
}
