package com.neotech.lesson17;

public class Task1 {

	public static void main(String[] args) {
// 		ou have a String a = "Is it saturday? Is it raining? Do we have
//		a Java Class today?" How would you find out how many
//				sentences are in that String?

//				If you find this easy: 
//				"Is it saturday! Is it raining? Do we have
//				a Java Class today."
		
		
		System.out.println("\"Cierra\"");
		
		String sentence = "Is it saturday? Is it raining? Do we have a java class today?";
		
		String [] array = sentence.split("\\?");
		System.out.println("Array length is " + array.length);
		
		String s2 = sentence.replaceAll("[?]", "+");
		System.out.println(s2);
		
		for (String str : array )
		{
			System.out.println(str);
		}
		//Is it Saturday! Is it raining? Do we have Java class today.
		
		String sentence2 = "Is it Saturday! Is it raining? Do we have a Java class today.";
		String [] array2 = sentence2.split("[!?.]");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
