package CountCharacterInStringusingStreams;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CountCharacters {

//	to count each character in a string using stream api.
	public static void main(String[] args) {
		List<String> names = Arrays.asList("Navin","Nithyananda");
		
		Map<String, Integer> countChars =  names.stream()
											.map(n -> Map.entry(n, n.length()))
											.collect(Collectors.toMap(Map.Entry::getKey,Map.Entry::getValue));
		
		names.stream().map(n->Map.entry(n, n.length())).forEach(System.out::println);
		
	System.out.println(countChars);
	}
}
