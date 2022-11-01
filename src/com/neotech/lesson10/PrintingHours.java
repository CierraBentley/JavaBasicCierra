package com.neotech.lesson10;

public class PrintingHours {
public static void main (String [] args) {
	
	//NESTED LOOPS 
	//print the whole combination of hours and minutes
	//in a digital clock 
	//00:00\//00:01\
	//23:59
	
	for(int hour = 0; hour < 24; hour++)
	{
		for (int minute = 0; minute < 60; minute++) 
		{
			
		//System.out.println(hour + ":" + minute);
		//1. we need to change 0:0 to 00:00 (up to 10)
		//2. what if 10:1-> update to 10:01
			if (hour < 10 && minute < 10) 
			{//case 1
				System.out.println("0" + hour + ":" + "0" + minute);
			} else if (hour >= 10 && minute < 10) 
			{
				//2nd case
				System.out.println(hour + ":" + "0" + minute);
			} else if (hour < 10 && minute >= 10) {
				System.out.println("0" + hour + ":" + minute);
			}
			else { 
				//case 4
				System.out.println(hour +  ":" + minute);
		}
	}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
}
