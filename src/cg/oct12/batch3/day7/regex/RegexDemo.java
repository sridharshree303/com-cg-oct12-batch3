package cg.oct12.batch3.day7.regex;

import java.util.regex.Pattern;
import java.util.regex.Matcher;


public class RegexDemo {

	public static void main(String[] args) {
		
	/*	String regex = "abc", input = "aaaaabcdalsdnfkuyet";

		Pattern pattern = Pattern.compile(regex);

		Matcher matcher = pattern.matcher(input);

		System.out.println(matcher.matches());
		System.out.println(matcher.lookingAt());
		System.out.println(matcher.find());
	 */
		
	//	String regex = "[a-zA-Z0-9]{5}", input = "aB6h7";
	//	String regex = "[\\d]{5}",input="95776";
	//	String regex = "[\\w\\h]{6}",input="4sh jS";
	//	String regex = "[\\w]{3}",input="%$&";    // non word 
	    String regex = "[\\D]{3}",input="546";
		
		Pattern p = Pattern.compile(regex);
		Matcher matcher = p.matcher(input);
		
		System.out.println(matcher.matches());
		System.out.println(matcher.lookingAt());
		System.out.println(matcher.find());
		
	}
}








