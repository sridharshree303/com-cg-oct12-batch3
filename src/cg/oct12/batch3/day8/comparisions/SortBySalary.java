package cg.oct12.batch3.day8.comparisions;

import java.util.Comparator;

public class SortBySalary implements Comparator<Employee>
{

		public int compare(Employee o1, Employee o2) {
			System.out.println("compare");
			return (int) (o1.salary - o2.salary);
		}
}
