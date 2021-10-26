package cg.oct12.batch3.day4;

public class AccessDemo {

	public static int publicMember1 = 10;
	protected static int protecetdMember = 20;
	static int packageMember = 30;
	private static int privateMember = 40;
	
	public static void main(String[] args) {
		
	  System.out.println(publicMember1);
	  System.out.println(protecetdMember);
	  System.out.println(packageMember);
	  System.out.println(privateMember);
	  System.out.println(AccessDemo.publicMember1);
	  System.out.println(AccessDemo.protecetdMember);
	  System.out.println(AccessDemo.packageMember);
	  System.out.println(AccessDemo.privateMember);
		

	}

}