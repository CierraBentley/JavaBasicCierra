package com.neotech.lesson20;

public class Homework1 {

	private static String getVowels (String str)
	{
		String result = str.replaceAll ("[^aeiouAEIOU]", "");
		
		
		return result;
		
		//you can also do this
		//return " ";
	}
	
	public static void main (String [] args) {
	
	System.out.println(getVowels("Good Evening"));
	
	
	
	
	
	
	
	
	
	
	
	
	}
}
