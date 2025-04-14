package GroupEmpByDepartment;

public class Employee {

//	Write a Java program to create a list of employees, 
//	where each employee has attributes like name, department, and salary. 
//	Use the Stream API to group these employees based on their department.
	private String name;
	private String department;
	private double salary;
	
	public Employee(String name, String department, double salary) {
		this.name = name;
		this.department = department;
		this.salary = salary;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", department=" + department + ", salary=" + salary + "]";
	}
	
	
}
