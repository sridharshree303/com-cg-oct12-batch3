package cg.oct12.batch3.day10.revision;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LinkedListDemo {

	public static void main(String[] args) {
		
		//Dynamic array  - we can say linked list is dynamic array.we can manipulate data inside array
		//array  -  static rigid array. the size is fixed in static
		//In linkedList both Forward and backward refers the data
		//In arrayList only forward refers the data
        //In arrayList lots of shifting is required
		//In Linked list data manipulation is simple
		//if the data is constant go for arraylist
		//if the data needs manipulate go for linkedlist
		//arraylist is better to store and fetch data
		//linked list is better to manipulate data

			LinkedList<Integer> list1 = new LinkedList<>(); // doubly linked list

			list1.add(10);
			list1.add(10);
			list1.add(20);
			list1.add(30);
			list1.add(null);
			System.out.println(list1);
			System.out.println(list1.size());
//			System.out.println(list1.capacity());
//			System.out.println(list1.get(list1.lastIndexOf(20)));
			System.out.println(list1.getFirst());

			List<Integer> list2 = new ArrayList<>(); // dynamic array
		
	}

}
