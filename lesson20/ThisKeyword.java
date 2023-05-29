package com.neotech.lesson20;

public class ThisKeyword {

	int a, b;
	
	ThisKeyword()
	{ }
	
	ThisKeyword (int a, int b)
	{
		this.a =a;
		this.b = b;
	}
	
	void sum ( int a, int b)
	{
		System.out.println("Sum of local varibales is " + (a + b));
		System.out.println("Sum of instance variables is " + (this.a +this.b));
	}
	
	
}
