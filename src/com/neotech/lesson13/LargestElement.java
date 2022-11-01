package com.neotech.lesson13;

public class LargestElement {
public static void main (String [] args) {
	
	//FIND THE LARGEST NUMBER IN AN ARRAY 
	
int [] numbers = {45, 34, 87, 33, 15, 92, -13, 55};  	

int largest = numbers[0];

//System.out.println("The largest number is: " + largest); -> PRINTS 45 
//NOW BELOW WE ARE COMPARING 

for (int i = 0; i < numbers.length; i++)
{
	if (largest < numbers[i])
	{
		largest = numbers[i];
	}
}
	System.out.println("The largest number is: " + largest);
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
}
