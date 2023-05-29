package com.neotech.lesson20;

public class ConstructorIntro {

	
	
	String name;
	int age;
	
	
	ConstructorIntro()
	{
		System.out.println("I am a default constructor");
	}
	
	
	
	
	
	
	
	public static void main (String [] args) {
//object type     identifier op  new    Constructor 
		ConstructorIntro con = new ConstructorIntro();
		con.name= "Cierra";
		con.age = 23;
		
		
		System.out.println(con.name + " " + con.age);
	
	
	
	
	}
	
}
