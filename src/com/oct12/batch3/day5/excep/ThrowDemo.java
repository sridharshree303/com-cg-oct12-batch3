package com.oct12.batch3.day5.excep;

public class ThrowDemo {

	static void checkEligibilty(int age) {

		if (age < 18) {
			throw new CanNotVoteException("You are Minor");
		} else {
			System.out.println("Vote for India.");
		}
	}

	public static void main(String args[]) {

		System.out.println("Election...");

		try {
			ThrowDemo.checkEligibilty(16);
		} catch (CanNotVoteException cnve) {
			System.out.println(cnve.getMessage());
		}
		System.out.println("end");
	}
}
