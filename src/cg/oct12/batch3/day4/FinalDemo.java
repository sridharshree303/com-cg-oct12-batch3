package cg.oct12.batch3.day4;



// final keyword - specifier
// we can't assign new value to final variables
// Final field/ variable - value can not be changed
// final method - can not be overridden
// final class - can not be extended
// final variables keep in capital letters


public class FinalDemo {
	
	final static int NUMBER_OF_OVERS = 20;
	
	

	private static final int num = 10;
	private static int num2 = 20;
	public static final int num3 = 16;
	
	public static void main(String[] args) {
		
		System.out.println(FinalDemo.num);
		System.out.println(FinalDemo.num2);
		System.out.println(FinalDemo.num3);
	//	FinalDemo.num = 15;
		FinalDemo.num2 = 30;
	//	FinalDemo.num3 = 40;          
		
		System.out.println(FinalDemo.num);
		System.out.println(FinalDemo.num2);
		
		
	}
	
}
