package Qs23_RemoveNullsFromList;

import java.util.Arrays;
import java.util.List;

public class RemoveNulls {

//	Write a program to remove all null values from a list of strings using Java Stream API.
	public static void main(String[] args) {
		List<String> strList = Arrays.asList("Apple",null,"banana","orange","mango",null);
		
		strList.stream().filter(n -> n!=null).forEach(System.out::println);
	}
}
