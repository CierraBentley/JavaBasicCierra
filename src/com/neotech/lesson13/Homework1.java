package com.neotech.lesson13;

public class Homework1 {
public static void main (String [] args ) {

	//Create a 2D array where you will store the following values:
	//	- Mr, Mrs, Ms, Miss
	//	-Smith, Jordan, Jackson, Obama.
	//After storing values print the following:
	//	Mrs Smith, Mr Obama, Ms Jackson, Miss Jordan.

	
	
	//				1D VS 2D ARRAYS
	//1d array -> contains multile string values (or other data types)
//	2d array-> contains mulitple 1d arrays
//1d	String [] examples = {"Cierra", "Berkant", "James"};
///2d 	String [] [] names = {{"Cierra", "Berkant", "James"}, {"Kate", "Chloe", "Savannah" },
	//{"Connor", "Aimee", "Craig"}}; 
	
	
	
	String [] [] names = {{"Mr", "Mrs", "Ms", "Miss"}, {"Smith", "Jordan", "Jackson", "Obama"}};
	
	System.out.println(names[0][1] + " " + names[1][0]);
	System.out.println(names[0][0] + " " + names[1][3]);
	System.out.println(names[0][2] + " " + names[1][2]);
	System.out.println(names[0][3] + " " +  names[1][1]);
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
}
