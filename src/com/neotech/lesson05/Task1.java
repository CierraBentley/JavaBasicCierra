package com.neotech.lesson05;

public class Task1 {
public static void main (String [] args) {
	
	/*
	 * Write a program. Create a variable day (1-7)
	 * For every weekday, print "Today is _ and we are working"
	 * FOr weekend days, print "We are on a break on weekend!"
	 */
	
	int day = 2;

	if (day == 1)
	{
		System.out.println("Today is Monday and we are working.");
	}
			
	if (day == 2)
	{
		System.out.println("Today is Tuesday and we are working.");
	}
	
	
	if (day == 3)
	{
		System.out.println("Today is Wednesday and we are working.");
	}
	if (day == 4)
	{
		System.out.println("Today is Thursday and we are working.");
	}
	
	if (day == 5)
	{
		System.out.println("Today is Friday and we are working.");
	}
	if (day == 6)
	{
		System.out.println("We are on a break on weekend!");
	}
	if (day == 7)
	{
		System.out.println("We are on a break on weekend!");
	}
	
	
	/*
	 * MODIFY QUESTION 
	 * Instead of "Today is __"
	 * Print "Today is a weekday..."
	 * If day 1-5 is weekday 
	 * If day 6-7 is weekend 
	 * else wrong input 
	 */
	
	if (day <6)
	{ 
		System.out.println("Today is a weekday and we are working");
	}
	else if (day < 8)
	{
		System.out.println("Today is a weekend and we are on a break");
	}
	
	
	
	
}
}
