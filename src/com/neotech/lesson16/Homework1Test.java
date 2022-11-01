package com.neotech.lesson16;

import java.util.Scanner;

public class Homework1Test {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		Homework1 hw = new Homework1();
		
		System.out.println("Please enter your first name:");
		String fName = scan.next();
		
		System.out.println("Please enter your last name:");
		String lName = scan.next();
		
		System.out.println("Please enter your email type:");
		String eType = scan.next();
		
		String fullEmail = hw.createEmail(fName,lName, eType);	
		
		System.out.println("The full email is: " + fullEmail);
		
	}

}
