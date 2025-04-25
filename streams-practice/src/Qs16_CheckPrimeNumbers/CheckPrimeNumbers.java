package Qs16_CheckPrimeNumbers;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class CheckPrimeNumbers {

//	Given a list of integers, write a program to find and print the prime numbers using Java Stream API.
	public static void main(String[] args) {
		List<Integer> nums = Arrays.asList(1,32,3,4,29,5,2,3,7,2);
		
		List<Integer> primes = nums.stream().filter(CheckPrimeNumbers::checkPrime).toList();
		System.out.println(primes);
	}
	public static boolean checkPrime(int n) {
		if(n<=1) return false;
		return IntStream.rangeClosed(2, (int)Math.sqrt(n)).allMatch(i -> n%i != 0);
	}
}
