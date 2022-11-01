package com.neotech.lesson09;

public class Recap {
public static void main (String [] args) {
	
//Print Good evening 5 times using loops
	
				//WHILE LOOP
	//we are responsible for where, when we start and stop
	
	int count = 1;
	while (count <= 5) //5], 6]
	{
		System.out.println("Good evening");
		count++; // count = count + 1 or count += 1  - changing it to control loop
	}
	
	System.out.println("-------------------------------");
	
	//DO WHILE LOOP
	
	int num = 1;
	do 
	{
		num++; //chaning "num" to control the loop
		System.out.println("Good evening");
	} while (num <= 5);  //(condition)
			
	
	//DIFFERENCE 
	int n1 = 10;
	while (n1 <=5) 
	{
		System.out.println("Good night");
		n1++;
	}
	
	int n2 = 10;
	do  //DO THIS - THEN CHECK THE CONDITION
	{
		System.out.println("good night");
		n2++;
	}while (n2 <=5); //THE CONDITION
	
	
	
	
	
	
	
	
	
	
}	
}
