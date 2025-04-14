package GroupTransactionByOwner;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupTransactionByOwner {
	
	
	public static void main(String[] args) {
		List<Transaction> transactions = Arrays.asList(
		           new Transaction("Alice", 1500.0),
		           new Transaction("Bob", 1200.0),
		           new Transaction("Alice", 1700.0),
		           new Transaction("Charlie", 1000.0)
		      );
		Map<Object, Double> groupByOwner = transactions.stream()
													.collect(Collectors.groupingBy(n -> n.getName(),
															Collectors.summingDouble(d -> d.getAmount())));
		
		System.out.println(groupByOwner);
	}
}
