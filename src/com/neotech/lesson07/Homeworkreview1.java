package com.neotech.lesson07;

import java.util.Scanner;

public class Homeworkreview1 {
public static void main (String [] args) {
	
//Ask the user to enter the height in inches. 
//Person should be classified as one of the following:
//• short (under 60 inch)
//• medium (between 60 -72 inch)
//• tall (over 72 inch)	
	
	int height ;
	Scanner scanner = new Scanner(System.in);
	
	System.out.println("enter your height");
	height = scanner.nextInt();
	
	//for short (0-59) height >0 and height <0
	//for medium (60-71) height >= 60 and <= 72
	//tall 72+ height > 72
	
	if (height > 0 && height < 60)
	{
		System.out.println("Classified as short!!");
	}
	else if (height >= 60 && height < 72) 
	{
		System.out.println("Classified as medium!!");
	}
	else if (height >= 72)
	{
		System.out.println("Classified as tall!!");
	}
	else 
	{
		System.out.println("Invalid input!!");
	}
	
}
}
