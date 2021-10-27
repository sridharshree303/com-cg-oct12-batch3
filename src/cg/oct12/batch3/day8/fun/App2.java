package cg.oct12.batch3.day8.fun;

public class App2 {

	static int num = 16;

	public static void main(String[] args) {
		
		FunLn2 obj =(int a, int b) -> {
			return a+b;
		};
		int output = obj.addNums(10,20);
		System.out.println(output);
		
		FunLn2 obj1 =(int c,int d)-> c+d;
		System.out.println(obj1.addNums(10, 25));

		FunLn3 obj3 = () -> num;
		System.out.println(obj3.getNum());
	}
}
