package Qs6_AverageOfNums;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class AverageOfNums {

//	Given a list of integers, write a program to calculate the average of all the numbers using Java Stream API.4
	public static void main(String[] args) {
		List<Integer> nums = Arrays.asList(1,32,3,4,25);
		
		long value = nums.stream().reduce(0, (c,e)->c+e)/nums.stream().count();
		
		int value1 = nums.stream().collect(Collectors.averagingInt(n -> n)).intValue();
		System.out.println(value1);
	}
}
