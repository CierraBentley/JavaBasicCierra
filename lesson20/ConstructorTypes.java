package com.neotech.lesson20;

public class ConstructorTypes {
String name;
int age; 
	ConstructorTypes()
	{
		System.out.println("I am a non-argument constructor");
	}
	
	ConstructorTypes(String str)
	{
		System.out.println("I am a constructor with a string " + str);
	}
	ConstructorTypes(int num)
	{
		System.out.println("I am a constructor with an int " + num);
	}
	ConstructorTypes(String str, int num)
	{
		System.out.println("I am a constructor with a String " + str + " and an int " + num);
	}
	
	ConstructorTypes (double d)
{
	System.out.println("I am a constructor with a double " + d);
}
	
	public static void main (String [] args) {
	
	ConstructorTypes ct = new ConstructorTypes();
	
	System.out.println(ct.name + " " + ct.age);
	
	ConstructorTypes ct1 = new ConstructorTypes("Cierra");
	
	
	
	
	}	
}
