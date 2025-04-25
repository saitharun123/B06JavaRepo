package Qs20_StringWithMaxLength;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class StringsWithMaxLength {

//	Given a list of strings, write a program to find and print the strings with the maximum length using Java Stream API.
	public static void main(String[] args) {
		List<String> strList = Arrays.asList("Banana","BlueBorries","Mangos","BlueBerries");
		
		//This gives a single element whichever comes first
		String str = strList.stream().collect(Collectors.toMap(Function.identity(), n -> n.length()))
										.entrySet()
										.stream()
										.max(Map.Entry.comparingByValue())
										.map(Map.Entry::getKey)
										.get();
		
		Integer maxLength= strList.stream().mapToInt(String::length)
											.max().getAsInt();
		
		List<String> strs = strList.stream().filter(s -> s.length()==maxLength).toList();
		
		System.out.println(strs);
	}
}
