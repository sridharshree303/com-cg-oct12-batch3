package vaman2;

public class Program {
	static {
		System.out.println("Staic1 block"); 
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       System.out.println("Main method");
       System.out.println("class"+ i);
		
	}
	static {
		System.out.println("Staic block");
	}
	static int i = 100;
	static {
	   System.out.println(i++);
	}

}
