package Qs21_ReverseListOfStrings;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ReverseListOfStrings {

//	Write a program to reverse a list of strings using Java Stream API.

	public static void main(String[] args) {
		List<String> strList = Arrays.asList("Apple","banana","orange","mango");
		
		List<String> reversedList = IntStream.range(0, strList.size())
											.mapToObj(i -> strList.get(strList.size()-i-1))
											.collect(Collectors.toList());
		
		System.out.println(reversedList);
	}
}
