package SortMapUsingStreams;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class SortMap {
//	Create map which contains string as key and Integer as value,
//	sort the map by its values in ascending order using stream api.
	public static void main(String[] args) {
		Map<String,Integer> map = new HashMap<>();
		map.put("Navin", 500);
		map.put("Jagan", 2500);
		map.put("Raju", 1000);
		map.put("Nivin", 5000);
		
		Map<String,Integer> sortedMap = map.entrySet().stream()
											.sorted(Map.Entry.comparingByValue())
											.collect(
													Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue)
													);
		
		System.out.println(sortedMap);
				
	}
}
