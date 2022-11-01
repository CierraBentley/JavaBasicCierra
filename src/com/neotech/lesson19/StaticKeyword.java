package com.neotech.lesson19;

public class StaticKeyword {

	
	//instance variables
	String color;
	int memory;
	
static String brand;
static boolean touchscreen;

//instance method
void displaySpecificInfo()
{
	System.out.println("We built a " + brand + " with " + memory + "GB with " + color + " color ");
}

	static void displaySpeificInfo2()
	{
	//	System.out.println("We built a " + brand + " with " + memory + "GB with " + color + " color ");
	//	Can only use static variables so can't do that^^	
		System.out.println("Brand is " + brand + " and the touchscreen is " + touchscreen);
	}
	
	public static void main (String [] args) {
		
	//we do not have to create an object for static variables 
	StaticKeyword.brand = "iPhone";
	touchscreen = true;
		
	StaticKeyword iphone1 = new StaticKeyword();
	iphone1.memory = 64;
	iphone1.color = "red";
	iphone1.displaySpecificInfo();
	
	StaticKeyword.displaySpeificInfo2();
	
	//dont do this
	//iphone1.touchscreen = false;
	
	StaticKeyword.touchscreen = true;
	displaySpeificInfo2();
	
	
		
		
		
		
		
	}
}
