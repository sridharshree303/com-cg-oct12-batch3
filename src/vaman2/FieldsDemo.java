package vaman2;

public class FieldsDemo {
	// static field
	static int num1;
	
	//non static field
	int num2;
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int num3;
       num3 = 1;
       FieldsDemo obj = new FieldsDemo();
       System.out.println(num1);
       System.out.println(obj.num2);
       System.out.println(num3);
       
	}

}
