package com.neotech.lesson17;

public class Homework2 {

	public static void main(String[] args) {

		
	String str = "Hello123456@#$%^&*)(All!!111";
	
	String str2 = str.replaceAll("[^a-zA-Z]","");
	
	System.out.println(str2);
	System.out.println("How many alpha characters are there? " + str.length());
		
	
	
	//HOW MANY SPECIAL CHARACTERS?
	System.out.println(str.replaceAll("[a-zA-Z0-9]", "").length());	
	
	String str3 = str.replaceAll("a-z", "-"); //not a regular expression
	String str4 = str.replaceAll("[az]",  ""); //might be what u expect
		
		
		
	}

}
