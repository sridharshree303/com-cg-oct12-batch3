package cg.oct12.batch3.day7.col;

import java.util.ArrayList;

public class CollectionDemo1 {

	public static void main(String[] args) {
		
		@SuppressWarnings("rawtypes")
		ArrayList<Comparable> a1 = new ArrayList<Comparable>();
		a1.add(20);      //auto boxing
		a1.add(10.5);    // duplicates allowed
		a1.add("A");  // Heterogeneous data allowed
		a1.add("B");
		a1.add("C");
        System.out.println(a1);
		System.out.println("Size2: "+a1.size());
		System.out.println("ArrayList: "+a1);
		a1.remove("A");
		a1.remove(2);
		System.out.println("Size3: "+a1.size());
		System.out.println("ArrayList: "+a1);
		
		for (int i=0;i<a1.size();i++) {         // For loop
			System.out.println(a1.get(i));
		
		}	
	}
}
