package cg.oct12.batch3.day4;

/*
 * constructor name is same as class name
 * it is a special type of method 
 * it does not have a return type 
 * it is used to create and initialize an object of the class 
 * by default JVM provides a zero-args constructor 
 * we also can define constructors 
 * but if we define a constructor, JVM will not provide any constructor
 * a class can have one or more constructors  
 */
public class Employee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee1 emp1 = new Employee1();

		// Employee1 emp3 = new Employee1();
		emp1.num1 = 101;
		emp1.num2 = 1000;
		emp1.str = "Sridhar";
		System.out.println(emp1.num1 + " - " + emp1.num2 + " - " + emp1.str);
		System.out.println(emp1.toString() + "\n");

		Employee1 emp2 = new Employee1();
		emp2.num1 = 102;
		emp2.num2 = 2000;
		emp2.str = "Chandhu";
		System.out.println(emp2.num1 + " - " + emp2.num2 + " - " + emp2.str);
		System.out.println(emp1.toString() + "\n");

		Employee1 emp3 = new Employee1(103, "Spartans", 12.75);
		System.out.println(emp3.eid + " - " + emp3.name + " - " + emp3.salary);
		System.out.println(emp1.toString());
	}

}

class Employee1 {
	int eid;
	String name;
	double salary; // 36 to 41 these are necessary for business perspective
	static int num1; // constructors are necessary to run java code properly
	int num2; // Boiler plate code - automatically generated code
	String str;

	public Employee1() {
		System.out.println("Employee Details");
	}

	/*
	 * right click -> source ->
	 * 
	 * public Employee1(int eid, String name) { super(); this.eid = eid; this.name =
	 * name; }
	 */

	public Employee1(int eid, String name, double salary) {
		super();
		this.eid = eid;
		this.name = name;
		this.salary = salary;
		System.out.println("parameterized constructor");
	}

	@Override
	public String toString() {
		return "Hello Sridhar - TOSTRING Method";
	}

}
