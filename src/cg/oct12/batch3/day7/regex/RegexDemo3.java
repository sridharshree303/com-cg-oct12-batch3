package cg.oct12.batch3.day7.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexDemo3 {

	public static void main(String[] args) {
		//1st way
		Pattern pt = Pattern.compile("gcom");
		Matcher mt = pt.matcher("co");
		
		boolean b = mt.matches();
		boolean c = Pattern.matches("abhi","abhi");
		boolean d = mt.find();
		System.out.println(c);
		System.out.println(b);  
		System.out.println(d);
		
		//2nd way
		boolean d1 = Pattern.compile("Sri").matcher("Sri").matches();
		System.out.println(d1);
		
		//3rd way
		boolean e = Pattern.matches("Ram", "Seetha");
		System.out.println(e);
		

	}

}
