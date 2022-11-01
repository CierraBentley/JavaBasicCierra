package com.neotech.lesson07;

import java.util.Scanner;

public class ScanAndSwitch {
public static void main (String [] args) {
	
//ask the user about their country and print the language they speak
	
	Scanner scan = new Scanner (System.in);
	String country;
	
	//escape character
	System.out.println("Where are you from?");
	country = scan.next();
	
	if (country.equals("Albania"))
	{
	System.out.println("You speak Albanian!");
	}
	else if (country.equals("Turkiye"))
	{
		System.out.println("You speak Turkish");
	}
	else if (country.equals("Ecuador"))
	{
		System.out.println("You speak Spanish");
	}
	else if (country.equals("USA") || country.equals("UK")) //using or || 
	{
		System.out.println("You speak English");
	}
	
	
	
	switch(country)
	{
	case "Albania": 
		System.out.println("You speak Albanina");
		break;
	case "Turkey":
		System.out.println("You speak Turkish");
		break;
	case "USA": 
		System.out.println("You speak English");
		break;
	case "Spain":
	case "Ecuador":
		System.out.println("You speak Spanish");
		break;
	default: 
		System.out.println("I don't know what language you speak");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
}
