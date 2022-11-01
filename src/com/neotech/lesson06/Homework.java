package com.neotech.lesson06;

public class Homework {
	public static void main(String[] args) {

		// Write a java program to check if a patient has allergies.
		// If the patient does not have allergies print “You’re healthy!”.
		// If the patient has allergies, check if it is a peanut allergy, lactose
		// allergy,
		// bee allergy or seafood allergy
		// and print a statement telling the patient
		// “Don’t eat ___”. (fill the line with the food names – peanut, seafood etc.)

		boolean allergy = true;
		boolean peanut = true;
		boolean lactose = false;
		boolean bee = true;
		boolean seafood = true;

		if (allergy) // the patient has allergies
		{			//if allergy is true, it is going to run this whole nested code
			System.out.println("You have allergies!");// didn't close bracket here 
														//to nested if
			if (peanut) // the patient has peanut allergies
			{
				System.out.println("Don't eat peanuts!");
			}		
			if (lactose) //false -> so no lactose allergy
			{
				System.out.println("Don't drink milk!");
			}
			if (bee) //patient has bee allergy
			{
				System.out.println("Stay away from bees!");
			}
			if (seafood) //->patient has seafood allergy 
			{
				System.out.println("Don't eat fish!");
			}
		}	else { //If allergy is false -> NO ALLERGY
			System.out.println("You're healthy!");
		}

	}
}
