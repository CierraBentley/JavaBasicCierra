package com.neotech.lesson04;

public class Homework {
public static void main(String [] args) {
	
//2. Write a java program that converts mile to km and km to miles
//Use scale 1 mile = 1.609344
	
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
