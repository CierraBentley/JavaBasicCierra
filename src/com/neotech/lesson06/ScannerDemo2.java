package com.neotech.lesson06;

import java.util.Scanner;

public class ScannerDemo2 {
public static void main (String [] args) {
	
	Scanner input = new Scanner(System.in);
	System.out.println("What is your name?:");
	String name = input.next(); 
	System.out.println("Nice to meet you: " + name);
	
	System.out.println("Who do you love?");
	String lover = input.next();
	System.out.println(lover + " loves you too, " + name);
	 
	System.out.println("How old are you?");
	int age = input.nextInt();
	System.out.println("Your age is: " + age);
	
	System.out.println("Is it raining right now? True or false?:");
	boolean rain = input.nextBoolean();
	System.out.println(rain + "?");

	if (rain) {
		System.out.println("Wear a jacket outside!");
	} else {
		System.out.println("Enjoy the weather");
	}
	
	
}
}
