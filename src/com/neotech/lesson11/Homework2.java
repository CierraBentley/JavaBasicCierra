package com.neotech.lesson11;

import java.util.Scanner;

public class Homework2 {
public static void main (String [] args) {
//	Ask the user to enter an integer and build the following pattern:
//		Hint: Use scanner, if user entered number 5, there should be two parts
//		The first part, 1 to 5
//		The second part, 4 to 1
//FIX THIS LATER
//		1 
//		1 2 
//		1 2 3 
//		1 2 3 4 
//		1 2 3 4 5 
//		1 2 3 4 
//		1 2 3 
//		1 2 
//		1
	
	Scanner scan = new Scanner (System.in);
	System.out.println("Enter a mumber: ");
	int num = scan.nextInt();
	
	for (int i = 0; i < 9; i++)
	{
		for (int j = 0; j < 9; j++)
		{
			System.out.print(5);
		}
		System.out.println();
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
}
