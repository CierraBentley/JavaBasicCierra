package com.neotech.lesson04;

public class Homework4 {

	public static void main (String [] args) {
		
		//1. Create a Java program and name it Double Comparison.
		//Declare 2 double values and if value of first variable is higher then the second,
		//print “Double value __ is larger than __ .”
		//Otherwise print...

		double d1, d2;
		d1 = 15;
		d2 = 10;		
		
		if (d1 > d2) {
			System.out.println("Double value " + d1 + " is larger than " + d2);	
		}
		
		if (d1 < d2) {
			System.out.println("Double value " + d1 + " is less than " + d2);
		}
		
		
	
		//Create a Java program and name it Temperature Check.
		//Create variable to store temperature.
		//Your program should check if temperature is below 32
		//If temperature is below
		//then it should print “Water will freeze with temperature __”,
		//otherwise “Water will NOT freeze with temperature __”.	
		
		
		int temp = 28;
		
		if (temp > 32) {
			System.out.println("Water will NOT freeze with temperature " + temp);
		}
		
		if (temp < 32) {
			System.out.println("Water will freeze with temperature " + temp);
		}
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
