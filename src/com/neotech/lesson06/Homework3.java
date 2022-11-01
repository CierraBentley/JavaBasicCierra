package com.neotech.lesson06;

public class Homework3 {

	public static void main(String[] args) {
//Write a java program to check whether number is even or odd
		
		//eet your number 
		int number = 2737; 
		
//FIRST METHOD
		int remainder = number % 2;
		
		//check if the remainder is 0 
		if(remainder == 0)
		{
			System.out.println("This number is an even number!");
		} else {
			//the number is odd 
			System.out.println("This number is an odd number!");
		}
		
//SECOND METHOD
		if (remainder == 1) {
			//the number is odd 
			System.out.println("This number is an odd number!");
		} else {
			//the number is even
			System.out.println("This number is an even number!");
		}
		
		
//THIRD METHOD 
		
		if (number % 2 == 1) { //if you did == 0 means even number
			System.out.println("This number is an odd number!");
		} else {
			System.out.println("This number is an even number!");
		}
		
//FOURTH METHOD 
		boolean isEven = number % 2 == 0;
		
	if (isEven) {
		System.out.println ("This number is an even number!");
	} else {
		System.out.println("This number is an odd number!");
	}
		
		
		
		
		
		
	}

}
