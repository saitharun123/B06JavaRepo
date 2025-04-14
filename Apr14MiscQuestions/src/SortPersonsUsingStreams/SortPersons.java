package SortPersonsUsingStreams;

import java.util.Arrays;
import java.util.List;

public class SortPersons {

//	sort this list by  in ascending order and display the sorted list.
	public static void main(String[] args) {
		List<Person> persons = Arrays.asList(new Person("Jathin",25),new Person("Anu",12),new Person("Srinu",23),
				new Person("Bandit",18),new Person("Madhu",21));
		List<Person> sortedList = persons.stream().sorted((p1,p2)->p1.getAge()-p2.getAge()).toList();
		System.out.println(sortedList);
	}
}
