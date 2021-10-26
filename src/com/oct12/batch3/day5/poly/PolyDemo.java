package com.oct12.batch3.day5.poly;


// polymorphism
// one object takes many forms


public class PolyDemo {

	
	public static void main(String[] args) {
		
		Calc obj = new Calc();
		System.out.println(obj.addNumbers(10));
		System.out.println(obj.addNumbers(20,30));
		System.out.println(obj.addNumbers(40,50,60));
	
		Child child = new Child();
		child.someMethod();
	}
}
