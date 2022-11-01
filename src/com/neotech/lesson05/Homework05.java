package com.neotech.lesson05;

public class Homework05 {
public static void main (String [] args) {
	
	//Write a java program to check if a patient has allergies.
    //If the patient does not have allergies print “You’re healthy!”.
    //If the patient has allergies, check if it is a peanut allergy, lactose allergy, 
	//bee allergy or seafood allergy 
    //and print a statement telling the patient 
    //“Don’t eat ___”. (fill the line with the food names – peanut, seafood etc.)
	
	boolean allergies = true;
	boolean peanut = true;
	boolean lactose = false; 
	boolean bee = false;
	boolean seafood = false;
	
	if (allergies) 
	{
		if (peanut) 
		{
			System.out.println("Don't eat peanuts");
		}
		if (lactose) 
		{
			System.out.println("Don't eat lactose");
		}
		if (bee) 
		{
			System.out.println("Don't go near bees");
		}
		if (seafood)
		{
			System.out.println("Don't eat seafood");
		}
	}
	
	else 
	{
		System.out.println("You're healthy!");
	}
		
	//IDONT KNOW
	//Write a program to implement following logic using
	//if-else if-else statement:
	// if hour is less than 12 noon, greet with Good Morning
	// if hour is greater than or equal 12 noon but less than 3 pm, 
	//greet with Good Afternoon
	//if hour is greater than or equal to 3 pm, greet with Good Evening
	
	int hour = 1200;
	
	if (hour < 1200);
	{
		System.out.println("Good morning");
	}
	if (hour >=1200 && hour <1500);
	{
		System.out.println("Good afternoon");
	}
	if (hour >= 1500) 
	{
		System.out.println("Good evening");
	}
}
}
