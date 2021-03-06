package cg.oct12.batch3.day7.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexDemo1 {

	public static void main(String[] args) {

		
//		String regex = "[a-zA-Z0-9]{5}", input = "acA9v"; // abc xyz ijk // ABC 123
//		String regex = "[a-zA-Z0-9#@\\h]{5}", input = "a_  @"; // abc xyz ijk // ABC 123
//		String regex = "[\\d]{3}", input = "457"; // [0-9]{3}
		String regex = "[\\D]{3}", input = "aw#"; // [non digit characters]{3}
//		String regex = "[\\w]{3}", input = "4Ya"; // [a-zA-Z0-9]{3}
//		String regex = "[\\w]{3}", input = "#Ya"; // abc xyz ijk // ABC abc 123

		
		Pattern pattern = Pattern.compile(regex);

		Matcher matcher = pattern.matcher(input);

		System.out.println(matcher.matches());
		System.out.println(matcher.lookingAt());
		System.out.println(matcher.find());

	}

}

 /*
  * matches method
  * 
  */
