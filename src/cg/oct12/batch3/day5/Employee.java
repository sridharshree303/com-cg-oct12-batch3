package cg.oct12.batch3.day5;

public class Employee {

	// Encapsulation
	// bind data members with methods
	// to secure data
	// make fields as private
	// make public methods to access those fields

	// for entity classes always -
	// create private fields
	// Generate default constructor,full-parameterized

	public int eid;
	private String firstName;
	private double salary ; // if u make private in main class EncapsulationDemo will
	// get error

	public int getEid() {
		return eid;
	}

	public void setEid(int eid) {
		this.eid = eid;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String Sridhar) {
		this.firstName = firstName;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", firstName=" + firstName + ", salary=" + salary + "]";
	}

	/*
	 * public double getSalary() { //getters return this.salary; }
	 * 
	 * public void setSalary(double salary) { //setters this.salary = salary; }
	 */

}
