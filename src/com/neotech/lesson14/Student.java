package com.neotech.lesson14;

public class Student {
// NO MAIN METHOD BECAUSE RIGHT NOW WE ARE WRITING A BLUE PRINT AND MAKING OBJECTS 
	
// features:
// - firstName. lastName, studentId, school, gender. grade
	
	String firstName, lastName, school;
	int studentId; 
	char gender; 
	char grade; 
	
// behaviors
// study(), doHomework(), 
	
	void study() // -> this is a method
	{
		System.out.println(firstName + " " + lastName + " is studying");
	}
	void doHomework() 
	{
		System.out.println(firstName + " is doing homework");
	}
	
	// NOTHING CAN BE RUN BECAUSE THERE IS NO MAIN METHOD 
	// THIS IS THE BLUE PRINT 
	//WILL BE USING IN 'SCHOOL' CLASS IN SAME PACKAGE
	
	
	
	
	
}
