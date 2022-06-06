package cg.oct12.batch3.day4;

//access static member in static context - class reference 
//access static member in non-static context - class reference 
//access non-static member in static context - object reference 
//access non-static member in non-static context - this reference 
public class ThisDemo {

	static int num1;
	int num2;

	static void staticMethod() {
		ThisDemo obj = new ThisDemo();
		System.out.println("Static method");
		System.out.println(num1);
		System.out.println(obj.num2);
	}

	void nonStaticMethod() {
		// ThisDemo obj1 = new ThisDemo(); - it will ot
		System.out.println("Non static method");
		System.out.println(num1);
		System.out.println(this.num2);
	}

	public static void main(String[] args) {
		ThisDemo th = new ThisDemo();
		staticMethod();
		num1 = 5;
		th.num2 = 10;
		th.nonStaticMethod();

	}

}
