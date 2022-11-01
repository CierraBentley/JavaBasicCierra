package com.neotech.lesson12;

public class RetrieveElements {
public static void main (String [] args) {
	
	char[] grades = { 'A', 'B', 'V', 'D', 'F' } ; 
	
	//loop through the grades array 
	for (int i =0; i < grades.length; i++) 
	{
		System.out.print(grades[i] + ", ");
	}
	System.out.println(); 
	
	// 2ND WAY : ENHANCED LOOP / ADVANCED FOR LOOP / FOR=EACH LOOP 
	
	for(char grade : grades) //grade of grades = every element in grades
	{
		System.out.print(grade + ", ");
	}
	
	System.out.println();
	System.out.println("======================");
	
	String[] fruits = {"Apple", "Orange", "Pear", "Peach", "Kiwi", "Watermelom"};
	//Let's print the fruits on the screen 
	for (int i = 0; i < fruits.length; i++) 
	{
	//Print favorite fruit
	if (fruits[i].equals("Apple")) {
		System.out.println(fruits[i] + " is my fav fruit");
	} else {
		System.out.println(fruits[i]);
	}
	}
	
	System.out.println("========================");
	//Let's do it with the for-each loop 
	for(String fruit: fruits) 
	{
		if (fruit.equals ("Watermelon")) 
		{
			System.out.println(fruit + " is my fav fruit");
		} else 
		{
			System.out.println(fruit);
		}
	}
	
	
	
	
	
	
	

	
	
}
}
