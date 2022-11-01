package com.neotech.lesson07;

public class LogicalNOT {
public static void main (String [] args) {
	
// ! (NOT) -reserves the value of a boolean variable 
	
	boolean b1 = !true;
	System.out.println(b1);
	
	boolean b2 = !false;
	System.out.println(b2);
	
	//not only in front of a boolean variable, can work with
	// any expression
	
	
	System.out.println(!(6<5));
	
	boolean cold = false;
	if (!cold)
	{
		System.out.println("It is cold!!");
	}
	
	
	
	
	
	int x = 12;
	if (x == 12)
	{
		System.out.println("x is 12");
	}
	
	else 
	{
		System.out.println("x is NOT 12");
	}
	
	//we can write it like this 
	if (x != 12) 
	{
		System.out.println("x is not = 12");
	}
	
	
	
	
}
}
