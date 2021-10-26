package vaman2;

public class Methods {
   public static void main(String[] args) {
	System.out.println("Main");
	System.out.println(Methods.num());
	Methods.m1();
	System.out.println(Methods.pi());
  }
   
   static void m1()
   {
	   System.out.println("m1");
   }
   static int num()
   {
	   return 10;
   }
   static double pi()
   {
	return 3.142;
   }
   
}
