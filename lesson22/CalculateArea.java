package com.neotech.lesson22;

public class CalculateArea {

	static void area (int side1, int side2)
	{
		System.out.println("The area of the rectangle is: " + 
	side1 + side2);
	}
	
	static void area (int side)
	{
		System.out.println("The area of the square is: " + side * side);
	}
	
	static void area (int length, int width, int height)
	{
		System.out.println("The area of a box is: " + length*width*height);
	}

	//instance method 
	void area(double side1, double side2)
	{
		System.out.println("The area is: " + side1 * side2);
	}
}
