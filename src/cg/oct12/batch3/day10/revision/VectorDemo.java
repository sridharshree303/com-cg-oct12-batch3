package cg.oct12.batch3.day10.revision;

import java.util.Vector;
public class VectorDemo {

	public static void main(String[] args) {
		
     /*Vector proves to be very useful if you don't know the size of the array in advance or you just
		need one that can change sizes over the lifetime of a program.
       In ArrayList it is not possible to check the internal capacity(no such method).
      But in Vector we can check internal capacity and incrementing capacity using predefined
      method.
     */
		Vector<Integer> v1 = new Vector<>();

		v1.add(10);
		v1.add(20);
		v1.add(30);
		System.out.println(v1);
		System.out.println(v1.size());
		System.out.println(v1.capacity());
		v1.add(10);
		v1.add(20);
		v1.add(30);
		System.out.println(v1);
		System.out.println(v1.size());
		System.out.println(v1.capacity());
		v1.add(10);
		v1.add(20);
		v1.add(30);
		System.out.println(v1);
		System.out.println(v1.size());
		System.out.println(v1.capacity());
		v1.add(10);
		v1.add(20);
		v1.add(30);
		System.out.println(v1);
		System.out.println(v1.size());
		System.out.println(v1.capacity());
		v1.add(10);
		v1.add(20);
		v1.add(30);
		v1.add(10);
		v1.add(20);
		v1.add(30);
		v1.add(10);
		v1.add(20);
		v1.add(30);
		v1.add(10);
		v1.add(20);
		v1.add(30);
		v1.add(10);
		v1.add(20);
		v1.add(30);
		v1.add(10);
		v1.add(20);
		v1.add(30);
		v1.add(10);
		v1.add(20);
		v1.add(30);
		v1.add(10);
		v1.add(20);
		v1.add(30);
		v1.add(10);
		v1.add(20);
		v1.add(30);
		v1.add(10);
		v1.add(20);
		v1.add(30);
		v1.add(10);
		v1.add(20);
		v1.add(30);
		v1.add(10);
		v1.add(20);
		v1.add(30);
		v1.add(10);
		v1.add(20);
		v1.add(30);
		v1.add(10);
		v1.add(20);
		v1.add(30);
		v1.add(10);
		v1.add(20);
		v1.add(30);
		v1.add(10);
		v1.add(20);
		v1.add(30);
		System.out.println(v1);
		System.out.println(v1.size());
		System.out.println(v1.capacity());


		

	}
}
