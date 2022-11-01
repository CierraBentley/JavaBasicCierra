package com.neotech.lesson11;

public class Task1 {
public static void main (String [] args) {
	
	//create an array of chars and store grades into it :
	//ABCDEF => then print a grade B (use 2 dif ways of creating an array
	
	//1st way
	char[] grades = new char[6]; //creates char array with 6 spaces 
	grades [0] = 'A';
	grades[1]  = 'B';
	grades[2]  = 'C';
	grades[3]  = 'D';
	grades[4]  = 'E';
	grades[5]  = 'F';
	
	
//2nd way 
	char[] grades2 = {'A', 'B', 'C', 'D', 'E', 'F' };
	
	
	//printing letter B
	System.out.println(grades[1]);
	System.out.println(grades2[1]);
	
	
	
	
}
}
