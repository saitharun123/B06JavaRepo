package Qs2_MaxElement;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class MaxElement {

//	Given a list of integers, write a program to find and print the maximum element using Java Stream API
	public static void main(String[] args) {
		List<Integer> nums = Arrays.asList(1,32,3,4,25);
		
//		Integer maxNum = nums.stream().max(Integer::compareTo).get();
		Integer maxNum = nums.stream().max(Comparator.comparingInt(i -> i)).get();
		System.out.println(maxNum);
		
	}
}
