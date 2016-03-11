package sorting.ue.employees;

import java.util.Arrays;

public class EmployeeDemo {

	public static void main(String[] args) {
		
		Employee[] emp = new Employee[3];
		emp[0] = new Employee(1, "Dominik", 2000, "IT");
		emp[1] = new Employee(3, "David", 2000, "IT");
		emp[2] = new Employee(2, "Stefan", 2000, "HR");
		
		System.out.println("Befor sorting:");
		
		for (Employee employee : emp) {
			System.out.println(employee);
		}
		
		System.out.println("After sorting:");
		
		Arrays.sort(emp);
		
		for (Employee employee : emp) {
			System.out.println(employee);
		}

	}

}
