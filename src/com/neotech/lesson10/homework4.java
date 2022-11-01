package com.neotech.lesson10;

import java.util.Scanner;

public class homework4 {
public static void main (String [] args) {
	
//Create a program that will be asking the user to apply
//for a credit card 10 times.
 //as soon as you get "yes" stop asking
	
	
	
//USE for loop since there is number of iterations
//ask max 10 times, if yes before break loop
	
Scanner scan = new Scanner(System.in);
String input;
//ask user 10 times
for(int i = 0; i < 10; i++) 
{
	System.out.println("Do you want to apply "
			+ "for a credit card?");
	input = scan.next();
	
	if (input.equals("yes")) 
	{
		System.out.println("Perfect, good choice!");
		break;
	}
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
}
