package cg.oct12.batch3.day8.fun;

//1.abstract method usage - by implementing the interface
//2.functional Interface - Interface contains only one abstract methods and may or may not contains other methods
public class App {

	public static void main(String[] args) {

		FunIn obj = new FunIn() {                        //Inner class
			@Override
			public void anotherAbstractMethod() {
				System.out.println("anotherAbstractMethod");
			}

			@Override
			public void abstractMethod() {
				System.out.println("abstractMethod");
			}

			@Override
			public void functionalMethod() {
				// TODO Auto-generated method stub
				
			}
		};

		obj.abstractMethod();
		obj.anotherAbstractMethod();

	}
}
// // this is possible 
//	class SomeClass {
//	}
//	static class SomeStaticClass {
//	}

//// 1. abstract method usage - by implementing the interface 
//public class App implements FunIn {
//
//	public static void main(String[] args) {
//
//		FunIn.staticMethod();
//
//		App obj = new App();
//		obj.abstractMethod(); // this example 
//		obj.defaultMethod();
//		obj.anotherDefaultMethod();
//
//	}
//
//	@Override
//	public void abstractMethod() { // this exaample 
//		System.out.println("abstractMethod");
//	}
//}
