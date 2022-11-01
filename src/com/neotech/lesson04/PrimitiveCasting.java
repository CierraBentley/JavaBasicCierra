package com.neotech.lesson04;

public class PrimitiveCasting {
public static void main(String [] args) {
	
//casting or converting 
//byte -> short -> int -> long -> float -> 
	
	//JAVA TYPE CASTING 
			//Widening casting (implicit/automatic- converting lower data types 
			//into higher 
			// byte -> short -> int -> long -> float -> double
			
			//Narrowing casting (explicit/manual) - converting higher data
			//types into lower 
			//double->float->long->int->short->byte

double d1 = 3.7; //no casting/conversion 
System.out.println(d1);

double d2 = 6; //casting is happening 
System.out.println(d2);

//widening, implicit casting, automatically
int num1 = 5;
double d3 = num1; //casting is happening
System.out.println(d3);

//int num2=6.3; -> ERROR because int doesn't store decimals
//NARROWING
int num2 = (int) 6.3; //Telling Java I want to store it as an int 
System.out.println(num2);// prints as 6

//Narrowing, EXPLICIT casting, should be done manually
byte b1 = (byte) 4253;//I tell Java, I take responsibility 
System.out.println(b1);

int i2 = 45;
byte b2 = (byte) i2; //"I may or may not lose data"
System.out.println(b2); //I did NOT lose data 

long l1 = 17;
//int number1 = l1; THIS IS WRONG
int number1 = (int) l1; //Now it works
System.out.println(l1); //Did not lose data 

long l2 = 56734564647856L;
int number2 = (int) l2;
System.out.println(number2); //I DID lose data 

int number5 = 247;
float f1 = (float) number5; //I can specify but don't need to
float f2 = number5; // Even if I don't specify, it will cast/convert 
System.out.println(f1); // Print as 247.0
System.out.println(f2); // Print as 247.0

//Create a int variable named number1, assign the value of 500.
//Store/assign number1 into a byte name number2
//Re-assign the number1 into number2.
//Print the value of number2. Check if it is 500
//What if the initial value was 50?
	
int numbr1 = 500;
byte numbr2 = (byte) numbr1;
System.out.println(numbr2); //Print as -12

numbr1 = 50;
byte numbr3 = (byte) numbr1;
System.out.println(numbr3); //Prints as 50 



	
	
	
	
	
}
}
