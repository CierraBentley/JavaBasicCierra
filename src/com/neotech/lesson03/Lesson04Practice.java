package com.neotech.lesson03;

public class Lesson04Practice {

	public static void main(String [] args) {
		
		//JAVA TYPE CASTING 
		//Widening casting (implicit/automatic- converting lower data types 
		//into higher 
		// byte -> short -> int -> long -> float -> double
		
		//Narrowing casting (explicit/manual) - converting higher data
		//types into lower 
		//double->float->long->int->short->byte
		
		double d = 10;
		System.out.println(d);
		
		double x = 2.7;
		int y = (int) x; 
		System.out.println(y);
	
	//CONDITIONAL STATEMENTS
		//are used to insert verification points and error handling 
		
		//If statement - evaluates a condition. If conditions is 
			//evaluates to true, any statements in the subsequent code block
			//are executed 
			//if (boolean_expression) {
				//executes when the boolean expression is true }
		int a = 2; 	
		if (a==2) {
					System.out.println("The value of a is 2");
			}
		
		//The if...else statement checks a condition. If it resolves to true the 
		//first code block is executed. If the condition resolves to false
		//the second code block is run instead
			//if (boolean_expression) { 
				//executes when boolean expression is true 
			//} else {
				//executes when boolean expression is false 
				//}
			int b=2; 
			if (b==2) {
					System.out.println("the value of b is 2");
			} else {
					System.out.println("the value of b is not 2");
			}

	//FORMULA
	//if(boolean_expression1) {
			//executes when the boolean expression is true 
		//} else if (boolean+expression 2) {
			//executes when the boolean expression 2 is true 
		//} else is (boolean_expression3) {
			//executes when the boolean expression 3 is true 
		//} else {
				//executes when none of the above condition is true 
			//}	
			
					
			
	//PRACTICE PROBLEM - IF ELSE IF STATEMENT 	
		//Write a program to implement the following logic using if-else statement 
		//1. if hour is less than 12 noon, greet with Good morning 
		//2. if hour is greater than or equal to 12 noon but less than 3pm
		// greet with good afternoon 
		//3. if hour is greater than or equal to 3pm, greet with good evening
			
	int hour = 1200;
		if (hour < 1200) {
			System.out.println("Goodmorning");
		} else if (hour <1500 && hour >= 1200)	{
			System.out.println("Good afternoon");
		} else if (hour >= 1500) {
			System.out.println("Good evening");
		}
		
		
		//PRACTICE PROBLEM 2 
		//Create a Java program and name it Temperature Check 
		//Create a variable to store temperature. Your program should check
		//If temperature is below 32, then it should print "water will
		//freeze with temperature _", otherwise "water will NOT freeze
		//with temperature _". 
		
	int T = 32;
		if (T < 32) {
			System.out.println("Water will freeze with temperature");
			
			
		}
		
		
		
		
		
		
		
		
		
		
		
	}
	
}
