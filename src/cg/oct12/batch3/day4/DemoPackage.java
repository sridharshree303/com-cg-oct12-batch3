package cg.oct12.batch3.day4;

import java.util.Random;
import java.util.Scanner;

public class DemoPackage {
     
	public static void main(String[] args) {
		System.out.print("Enter your name : ");
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		System.out.println();
		sc.close();
		
		System.out.print("Print a random Number : ");
		Random random = new Random();
		System.out.println(random.nextInt());
	}
}
