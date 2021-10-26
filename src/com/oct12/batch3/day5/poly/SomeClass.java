package com.oct12.batch3.day5.poly;

public class SomeClass {

}
class Parent {

	public void someMethod() {
		System.out.println("some method from parent");
	}

}

class Child extends Parent {

	@Override
	public void someMethod() {
		System.out.println("some method from child");
	}
	
}