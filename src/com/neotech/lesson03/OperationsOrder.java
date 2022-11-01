package com.neotech.lesson03;

public class OperationsOrder {

	public static void main(String [] args) {
		
	//PEMDAS - Paranthesis, Exp, Mult, Div, Add, Sub
	
		int num1, num2, num3;
		
		num1 = 10 + 10 * 2; 
		System.out.println(num1); 
		
		num2 = (10 + 10) * 2;
		System.out.println(num2);
		
		num3 = 5 * 5 + 25/5 - 5;
		System.out.println(num3);
		
		
		
		//declared variables
		int h, w, a, p;
		
		//initialize --> giving initial value 
		h = 8;
		w = 5;
		
		
		a = h*w; //assigning the result of h*w to variable a 
		p = 2 * (h+w); 
		
		
		System.out.println("The perimeter of a rectangle with a width " + w +
				" and height " + h + " is equal to " + p + " and the area is "
				+ a + ".");
		
		
	
		
		
		
	}
}
