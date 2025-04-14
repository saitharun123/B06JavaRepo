package GroupEmpByDepartment;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupEmployeeByDept {

//	Write a Java program to create a list of employees,
//	where each employee has attributes like name, department, and salary.
//	Use the Stream API to group these employees based on their department.
	
	public static void main(String[] args) {
		List<Employee> employees = Arrays.asList(
									new Employee("Tharun","it",50000),
									new Employee("manoj","it",150000),
									new Employee("Madhu","bpo",15000),
									new Employee("Dinesh","bpo",25000),
									new Employee("raju","sales",35000)
									);
		
		 Map<Object, List<Employee>>groupByDept = employees.stream()
													.collect(Collectors.groupingBy(d -> d.getDepartment()));
		 
		 System.out.println(groupByDept);
	}
}
