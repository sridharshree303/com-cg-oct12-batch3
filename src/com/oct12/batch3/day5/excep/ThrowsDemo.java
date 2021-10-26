package com.oct12.batch3.day5.excep;

import java.lang.*;

public class ThrowsDemo {

	public static int divideNumbers(int dividend, int divisor) throws ArithmeticException {
		return dividend / divisor;
	}

	public static void main(String[] args) {

		System.out.println("Start");
		try {
			System.out.println(ThrowsDemo.divideNumbers(10, 5));
		} catch (ArithmeticException ee) {
			System.out.println(ee.getMessage());
		}
		System.out.println("End");
	}
}
