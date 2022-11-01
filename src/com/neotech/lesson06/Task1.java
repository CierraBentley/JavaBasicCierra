package com.neotech.lesson06;

import java.util.Scanner;

public class Task1 {
public static void main (String [] args) {
	//Write a program that asks user to enter first name and then last name. 
	//At the end system should display user’s full name.
	
	Scanner input = new Scanner(System.in);
	System.out.println("Please enter your first name:");
	
	String name = input.next();
	System.out.println("Please enter your last name:");
	
	String name2 = input.next();
	System.out.println("Full name: " + name + " " + name2);
	
	
}
}
