package vaman2;

public class MethodDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodDemo mobj = new MethodDemo();
		System.out.println("Start");
		hello();
		mobj.hi();
		MethodDemo.hello();
		System.out.println("End");
		mobj.get();
	}

	static void hello() // static - free access
	{

		System.out.println("Hi sridhar");
	}

	public void hi() {
		System.out.println("Hello");
	}

	void get() // non static - restricted access
	{
		System.out.println("Get method");
	}
}
