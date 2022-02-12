package cg.oct12.batch3.day7.regex;

import java.util.regex.Pattern;

public class RegexDemo4 {
	public static void main(String[] args) {
		
		System.out.println(Pattern.matches("[amc]","a"));
		System.out.println(Pattern.matches("[amn]{3}", "amn"));
		System.out.println(Pattern.matches("[^amn]{3}", "a"));
		System.out.println(Pattern.matches("[a-zA-Z]{2}", "aA"));
		System.out.println(Pattern.matches("[a-zA-S]{3}", "axT"));
		System.out.println("------------------------------");
		//Starts with particular M or S letters
		System.out.println(Pattern.matches("[MS][a-z]{5}","Monica"));
		System.out.println(Pattern.matches("[MS][a-z]{6}","Sridhar"));
		System.out.println(Pattern.matches("[MS][a-z]{5}","Priyaa"));
		System.out.println("------------------------------");
		//[x]? , X occurs once or not
		System.out.println(Pattern.matches("[xyz]?","x"));
		System.out.println(Pattern.matches("[xyz]?{2}","xx"));
		System.out.println("------------------------------");
		//[x]+ , X occurs once or more times
		System.out.println(Pattern.matches("[xyz]+","x"));
		System.out.println(Pattern.matches("[xyz]+","xxyyx"));
		System.out.println("------------------------------");
		//[x]* , X occurs once or more times
		System.out.println(Pattern.matches("[xyz]*","xyz"));
		System.out.println(Pattern.matches("[xyz]*","xyyzzxx"));
		
		
		
		
		
		
	}

}
