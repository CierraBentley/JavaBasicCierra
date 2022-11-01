package com.neotech.lesson06;

import java.util.Scanner;

public class ScannerDemo {
public static void main (String [] args) {
	
	//import scanner class
	//windows -> ctrl + shift + 0 
	//Mac -> cmd + shift + o 
	
	//declare a scanner variable
	Scanner input = new Scanner(System.in); //click on scanner import from java 
	System.out.println("Please enter your name:");
	//declare a variable to catch the user input 
	String name = input.next(); //Write name in console + enter and it write back
	//write name on the screen 
	System.out.println("Nice to meet you: " + name);
	
	System.out.println("Please enter your age:");
	int age = input.nextInt();
	System.out.println("Your age is: " + age);
	
	//declare double to get weight 
	System.out.println("Please enter your weight:");
	double weight = input.nextDouble();
	System.out.println("Your weight is: " + weight);
	
	System.out.println("Do you think it is going to rain today?:");
	boolean willRain = input.nextBoolean();
	System.out.println("You think it is going to rain: " + willRain);

	if (willRain) {
		System.out.println("Bring your umbrella with you!");
	} else {
		System.out.println("Enjoy the weather");
	}
	
	
}
}