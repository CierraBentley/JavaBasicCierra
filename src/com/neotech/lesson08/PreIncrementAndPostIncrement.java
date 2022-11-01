package com.neotech.lesson08;

public class PreIncrementAndPostIncrement {
public static void main (String [] args) {
	
	// ++ increment 
	// -- decrement 
	
	int x;
	int y = 10;
	
	//POST Increment 
	//1. perform x = y 
	//2. increment (y= y+1)
	x = y++;
	System.out.println(x); //x=10
	System.out.println(y); //y=11
	
	//PRE Increment
	int a;
	int b = 15;
	
	//first increment b =b +1
	//2. assign value of b to a 

	a = ++b;
	
	System.out.println(a); //a=16
	System.out.println(b); //b=16
	
	//Decrement -- //reducing by 1 
	  //PRE decrement 
	int c;
	int d = 14;
	
	c = --d; //(c = d -1)
	
	System.out.println(d);//prints 13
	System.out.println(c); //prints 13

	//POST DECREMENT 
	int e;
	int f = 12;
	
	e = f--; //e = f, and then now f is f -1
	
	System.out.println(e);//prints 12
	System.out.println(f);//prints 11
	
	
	
	
}
}
