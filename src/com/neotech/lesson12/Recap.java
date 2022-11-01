package com.neotech.lesson12;

public class Recap {

	public static void main(String[] args) {

	//let's create basic integer array
		
		int [] grades = new int [5];
		
		grades [3] = 85;
		grades [1] = 90;
		grades [2] = 100;
		grades [0] = 93; 
		grades [4] = 78;
		//reassign value of element
		grades[4] = 98;
		int size = grades.length;
		
		System.out.println("The size of the array after assinging values is " + size);
		//element with index # 2 
		System.out.println("The third element of the array is: " + grades[2]);
		
		//let/s find the total of all elements of the array 
		int total = grades[0] + grades [1] + grades [3] +  grades [2] + grades [4];
		System.out.println("The total is: " + total);
		
		
		//2nd way - find total using for loop
		int sum = 0;
		for (int i = 0; i < 5; i++) 
		{
			sum += grades[i]; // sum = sum + grades[i];
		}
		System.out.println("The total is: " + sum); 
		int avg = sum + grades.length;
		System.out.println("The avaerage is " + avg);
		
		System.out.println("================================");
		
		String[] cities = {"Paris", "New York" , "London", "Istanbul" , "Tokyo", "Boston"};
		System.out.println(cities[3]); //STARTS WITH ZERO //CITIES NAME = ELEMENTS
		
		System.out.println("The size of my string array is " + cities.length);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
