package com.oct12.batch3.day6.Enums;

public class App {

	public static void main(String[] args) {
		
		AppUser appuser = new AppUser();
		appuser.userName = "Sridhar";
		
		appuser.role =Role.DOCTOR;
		
		System.out.println(appuser.userName);
		System.out.println(appuser.role);
	}
}
