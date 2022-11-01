package com.neotech.lesson08;

import java.util.Scanner;

public class Recap {
public static void main (String [] args) {
	
	//FIND THE LARGEST AMONG 3 NUMBERS
	
	//declare three double 
	
	double a, b, c;
	Scanner scan = new Scanner(System.in);
	
	System.out.println("Enter three numbers: ");
	a = scan.nextDouble();
	b = scan.nextDouble();
	c = scan.nextDouble();
	
	//using nested if 
	//logic:
	//if a > b 
		//a >c 
			//a is the largest 
	//it means c is larger than a -> c is largest 
	//else meaning a<b 
	 	//if b>c 
		//b is largest 
	//else -> meaning c>b 
	//--> c is the largest 
	
	
	if (a>b)
	{
		if (a>c)
		{ 
			System.out.println(a + " is the largest number!");
		}
		else //a < c and c > b (because above first "if")
		{
			System.out.println(c + " is the largest number!");
		}
	}
	else // a < b 
	{
		if (b>c) //b > a and b > c 
		{
			System.out.println(b + " is the largest number!");
		}
		else // b<c and c>b>a 
		{
			System.out.println(c + " c is the largest number!");
		}
	}
	
	
	
	
	
	
	
	
}
}
