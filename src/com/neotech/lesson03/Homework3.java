package com.neotech.lesson03;

public class Homework3 {

	public static void main (String [] args) {
		
//1. Write a java program to display the area and the perimeter
//of a circle that has a radius of 5. Use pi = 3. 

			//Perimeter = 2(pi)r
			//area = (pi)(r)(r)
	
		int r = 5;
		int pi = 3; 
		
		int area = (pi * r * r);
		int perimeter = (2 * pi * r);
		
		System.out.println("Area of circle= " + area);
		System.out.println("Perimeter of circle= " + perimeter);
		
		
//2. Write a java program that converts mile to km and km to miles.
//Use scale 1 mile = 1.609344.
		
		double mile, km, scale; 
		scale = 1.609344;
		mile = 2;
		km = mile * scale;
		System.out.println(mile + " miles is " + km + " kilometers");
		//2.0 miles is 3.218688 kilometers 
		
		double km2 = 10;
		double mile2 = km2 / scale;
		System.out.println(km2 + " Kilometers is " + mile2 + " miles");
		//10. kilometers is 6.2137119223733395 miles
		
		
		
		
		
		
		
		
	}
}
