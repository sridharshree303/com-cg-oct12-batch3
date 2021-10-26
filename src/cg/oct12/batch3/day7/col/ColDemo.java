package cg.oct12.batch3.day7.col;

import java.util.ArrayList;

import cg.oct12.batch3.day7.regex.RegexDemo;

public class ColDemo {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		
		//arrays have limited functionality
		//collection have many functionalities
		int[] arr = new int[5];
		System.out.println(arr[4]);
         
		@SuppressWarnings("unused")
		RegexDemo reg = new RegexDemo();
		//collection accepts only object values
		@SuppressWarnings("rawtypes")
		ArrayList myList = new ArrayList();
		
		System.out.println(myList.size());
		myList.add(10);
		myList.add(10);
		myList.add(10.5);
		myList.add("ABC");
	//	myList.add(reg);
		System.out.println(myList.size());
		myList.add("Bbs");
		System.out.println(myList.size());
		
		
		// here add is non static method ,, by array
		
		System.out.println(myList);
		System.out.println(myList.get(2));
	    System.out.println("-----------------------------------");
		@SuppressWarnings("rawtypes")
		ArrayList myList2 = new ArrayList();
		myList2.add(22);
//		myList2.add(myList);     //check the below with comment 
		myList2.addAll(myList);
		myList2.add("abd");
		System.out.println(myList2);
		System.out.println(myList2.size());
		
		myList2.remove(2);          //remove method  -- index 3 10.5 is removed
		System.out.println(myList2);
		System.out.println(myList2.size());
		
		
	}

}
