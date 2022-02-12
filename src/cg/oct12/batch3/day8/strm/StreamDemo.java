package cg.oct12.batch3.day8.strm;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamDemo {

	public static void main(String[] args) {
		
		// create a List of employees
		List<Employee> empList = new ArrayList<>();
		
		// create employees' data to process
		empList.add(new Employee(101, "Vaman", 10000));
		empList.add(new Employee(102, "Raman", 18000));
		empList.add(new Employee(103, "Soman", 12000));
		empList.add(new Employee(104, "Suman", 15000));
		empList.add(new Employee(105, "Lakshman", 20000));

		// print the list
		System.out.println(empList);

			
		// convert List to Stream
		System.out.println("\nconvert List to Stream");

		Stream<Employee> empStream = empList.stream();

			// using filter() to get specified data
		System.out.println("\nUsing filter() to get specified data ");

		Stream<Employee> employeesWithMoreSalary = empStream.filter(e -> e.salary > 19000);
//------------------------------------------------------------------------------------------------------
		employeesWithMoreSalary.forEach(e -> System.out.println(e));
		
		List<Employee> list = empList.stream().collect(Collectors.toList());
		System.out.println(list);
	}
}
