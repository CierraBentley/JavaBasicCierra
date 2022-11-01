package com.neotech.lesson03;

public class StringConcatenation {
	
	public static void main (String [] args) {
		
	//concatenate means to join together 
	//main + CTRL + space 
		
		String language = "Java";
		
		System.out.println("I love Java Programming");
		//now do this
		System.out.println("I love " + language + " Programming");
		
		String s1 = "I love ";
		String s2 = " programming";
		
		System.out.println(s1 + language + s2);
		
		//string + number 
		String s3 = "I am " + 2; //prints as I am 2
		System.out.println(s3);
		String s4 = s3 + 3; //I am 2 + 3 --> prints as I am 23
		System.out.println(s4);
		
		String two = "2";
		String four = "4";
		int a = 2;
		int b = 4;
		
		System.out.println(two + four);
		System.out.println(a + b);
		System.out.println(two +b); //String + number --> bigger string
		    
		
		
		
		//order of operations in a string
				//order: 1, 2, 3, 4
				System.out.println("I have " + 2 + 4 + " apples!");
				//four operations: 
				//1. I have 2
				//2. I have 24
				//3. I have 24 apples!
				
				System.out.println("I have " + (2 + 4) + " apples!");
				//1. 2 + 4 = 6
				//2. I have 6
				//3. I have 6 apples
		
		
		
	}
}
