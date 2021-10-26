package cg.oct12.batch3.day5.abstarct;

//abstract and concrete
//interface

/*
 * abstract method
 *  has the keyword abstract 
 *  has only method signature 
 *  does not have method body 
 *  can be defined in abstract class 
 *  can not be defined in concrete class 
 *  abstract class 
 *  has the keyword abstract 
 *  object can not be created 
 *  can contain zero or more abstract methods 
 *  can contain zero or more concrete methods 
 *  can also contain both 
 * 
 * 
 * interface mainly contain abstract methods
 * form java8, also contain static and default methods
 * allow multiple inheritance in java
 * 
 * abstraction is minimum necessary information
 * is a process of hiding data and showing functionalities
 */

interface FinanceMinistry {

    abstract void payInterestOnDeposits();

}

interface StateGovt {

	public abstract void paySalaryToEmployees();

}

abstract class Rbi {

	abstract void doKyc(); // Aadhaar, PAN, Passport, ... // accepts public,protected access specifiers

	void openAccount() {
		System.out.println("Hello RBI");
	}

	void payLoans() {
		System.out.println("Pay loans");
	}
}

class HdfcBank extends Rbi implements FinanceMinistry, StateGovt {

	@Override
	void doKyc() {
		System.out.println("Aadhaar");
	}

	@Override
	public void paySalaryToEmployees() {

		System.out.println("Salary to Employees");
	}

	@Override
	public void payInterestOnDeposits() {

		System.out.println("Interest");
	}

}

class IciciBank extends Rbi {

	@Override
	void doKyc() {
		System.out.println("PAN Card");
	}
}

public class App {

	public static void main(String[] args) {

		HdfcBank obj = new HdfcBank();
		obj.doKyc();
		obj.paySalaryToEmployees();
		obj.payInterestOnDeposits();
		IciciBank obj2 = new IciciBank();
		obj2.doKyc();
		Rbi obj3 = new HdfcBank();
		obj3.openAccount();
		obj3.payLoans();
	}
}
