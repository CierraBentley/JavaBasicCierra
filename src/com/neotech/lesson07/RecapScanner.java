package com.neotech.lesson07;

import java.util.Scanner;

public class RecapScanner {
public static void main (String [] args) {

	Scanner scanner = new Scanner(System.in);	 	
//declare variables 
	String text1, text2, text3;
	int age, year;
	double salary;
	char gender;
	
		//COMMENTED THESE TO RUN NEXT EXAMPLES
	//System.out.println("Enter a sentence");
	//text1 = scanner.nextLine (); //read until space in text
	//System.out.println(text1);
	
	//text2 = scanner.nextLine();//if you don't put nextLine it will print
	//System.out.println(text2); //on all different lines
	
	//text3 = scanner.nextLine();
	//System.out.println(text3);
		

	
		///COMMENTED THESE TO RUN NEXT EXAMPLES
	//System.out.println("What is your age?");
	//age = scanner.nextInt();
	//System.out.println("Your age: " + age);
	//System.out.println("What year is it?");
    //year = scanner.nextInt();
	//System.out.println("The year is: " + year);
	//System.out.println("Enter your age and the year");
	//age = scanner.nextInt();
	//year = scanner.nextInt();
	//System.out.println(age + " " + year);
	
			//COMMENTED THESE TO RUN NEXT EXAMPLE 
	//System.out.println("Enter your salary:");
	//salary = scanner.nextDouble();
	//System.out.println(salary);
	
			//COMMENTED OUT TO RUN NEXT EXAMPLE
	//System.out.println("Enter your gender (M or F): ");
//ex))	//gender = scanner.next().charAt(0); ---> FASTER WAY in 1 step
					// IN 2 STEPS (BELOW) 
			//READ THE WORD WITH NEXT ()
	//String str = scanner.next();
				//GET THE CHAR YOU NEED WITH CHARAT
	//gender = str.charAt(0);
	///System.out.println(gender);
	
	System.out.println("Enter your name, city, age, gender, and salary");
	text1 = scanner.next();
	text2 = scanner.next();
	age = scanner.nextInt();
	gender = scanner.next().charAt(0); //because indexing starts at 0
	salary = scanner.nextDouble();
	System.out.println(text1 + " " + text2 + " " + age + " " + gender + " " + salary);
	
	
}
}
