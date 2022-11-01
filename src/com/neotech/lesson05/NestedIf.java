package com.neotech.lesson05;

public class NestedIf {
public static void main (String [] args) {
	
//EXAMPLE 1	
	//RUN THIS DIFFEREANT WAYS TO SEE RESULTS (change where true and false are)
	
	
boolean isMorning = true; // If this is false it will print "Good afternoon"
boolean isSchoolDay = true;// if this is false Prints "Good morning you are at home
														
	
	if (isMorning)
	{
		System.out.println("Good morning!");
		if (isSchoolDay)
		{
			System.out.println("You are at school!");
		}
		else 
		{
			System.out.println("You are at home!");
		}
	}
	
	else 
	{
		System.out.println("Good afternoon!");
	}
	
//EXAMPLE 2 

	//Going to ATM	
	
	
}
}
