package com.neotech.lesson14;

public class Dog {

//	features: breed, size, color and age
 //   behaviors: eat(), run(), bark(), naming()
	
	
	String breed;
	String size;
	String color; 
	String name;
	int age;
	
	void eat()
	{
		System.out.println(breed + ", age " + age + ", is eating");
	}
	
	void run()
	{
		System.out.println(color + " " + size + " " + breed + " is running");
	}
	
	void bark()
	{
		System.out.println(size + " " + breed + " is barking");
	}
	void name() 
	{
		System.out.println("This dog's name is " + name);
	}
	public static void main (String [] args) {
		
	Dog d1 = new Dog(); 
			
	d1.breed = "German Shepherd";
	d1.size = "large";
	d1.color = "Black";
	d1.age = 8;
	d1.name = "Anya";
	
	d1.run();
	d1.eat();
	d1.bark();
	d1.name();
	
	
//	PRINTS	
//		Black large German Shepherd is running
//		German Shepherd, age 8, is eating
//		large German Shepherd is barking
//		This dog's name is Anya
		
		
	}
}
