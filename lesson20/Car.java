package com.neotech.lesson20;

public class Car {
String make, model;
int year;

Car()
{
	System.out.println("I am a default Construcor");
	}


void printDetails()
{
	System.out.println("I have a " + year + " " + make + " " + model + " and it is great");
}

Car (String carMake, String carModel, int carYear)
{
	System.out.println("We are creating an object with parameter");
	
}
}
 