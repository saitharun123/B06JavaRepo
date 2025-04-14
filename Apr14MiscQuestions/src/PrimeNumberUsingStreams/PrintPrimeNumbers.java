package PrimeNumberUsingStreams;

import java.util.ArrayList;
import java.util.List;

public class PrintPrimeNumbers {

//	print all the prime numbers with in a given range using stream api.
	public void printPrimeNumbers(int start, int end) {
		List<Integer> nums = new ArrayList<Integer>();
		for(int i=start;i<=end;i++) {
			nums.add(i);
		}
		
		List<Integer> prime = nums.stream().filter(n -> n%2!=0 && n>2).toList();
		System.out.println(prime);
	}
	public static void main(String[] args) {
		PrintPrimeNumbers p = new PrintPrimeNumbers();
		p.printPrimeNumbers(20, 50);
	}
}
