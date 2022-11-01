package com.neotech.lesson05;

public class ElseIfCondition {
public static void main (String [] args) {
	
	double d1 = 15.5;
	double d2 = 15; 
	
	
	if (d1 > d2)
	{
		System.out.println("Number " + d1 + " is larger than " + d2);
	}
	else if (d1 == d2)
	{
		System.out.println("Number " + d1 + " is equal to " + d2);
	}
	
	else
	{
		System.out.println("Number " + d1 + " is less than" + d2);
	}
	
	
	

	




int a = 5;
int b = 7;

if (a == b)
{ 
	System.out.println("NUmber " + a + " is equal to " + b);
}
else if (a < b)
{ 
	System.out.println("Number " + a + " is larger than " + b);
}
else 
{
	System.out.println("Number " + a + " is less than " + b);
}




}
}