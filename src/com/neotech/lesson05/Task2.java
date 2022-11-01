package com.neotech.lesson05;

public class Task2 {
public static void main (String [] args) {
	//Create a Java program to check if it is Friday or not. If it is Friday,
	//print "It's Friday. I am going to watch a movie." and check the
	//date, if date is 13 print "I will watch a scary movie.". If date is not
	//13 print "I will watch a comedy.". If it is not Friday, print "It is NOT
	//Friday. I am going to study JAVA."
	

	String day = "Friday";
	
	int date = 13;
	
	if (day == "Friday")
	{ 
		System.out.println("It's Friday. I am going to watch a movie");
	
		if (date == 13) 
		{
			System.out.println("I will watch a scary movie");
		}
		else 
		{
			System.out.println("I will watch a comedy movie");
		} 
      }
	else 
		{
			System.out.println("It is NOT Friday. I am going to study JAVA");
		}
	
	
	
	//SECOND EXAMPLE -- play with these more by changing = true ; and date2 = ?
	
	
	boolean isFriday = true;
	int date2 = 15;
	
	if (isFriday)
	{
		System.out.println("It's Friday. I am going to watch a movie!");
		if (date2 == 13)
		{
			System.out.println("I will watch a scary movie");
		}
		else 
		{
			System.out.println("I will watch a comedy movie");
		}
	}
	else 
	{ 
		System.out.println("It's not Friday, so I will study Java");
	}
	if (isFriday)
	{
		System.out.println("It's Friday. I am going to watch a movie!");
	}
	else if (date == 15)
	{
		System.out.println("I will watch a thriller");
	}
}
}
