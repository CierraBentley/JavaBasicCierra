package com.neotech.lesson10;

public class patterns {

	public static void main(String[] args) {

		
		
		//PRINT THIS PATTERN
		
	//*
	//**
	//***
	//****
	//*****
		
		
	for (int row =1; row<=5; row++)
	{ //this inner loop executes as many times as the
	//value of row
		for (int col = 1; col <=row; col++)
		{
			System.out.print("*");
			
		}//this is for the new line
		System.out.println();
	}
		
	for (int row =5; row<=1; row++)
	{
		for (int col = 1; col <=row; col++)
		{
			System.out.print("*");
			
		}
		System.out.println();
	}
			
		
		
		
		
		
		
		
		
		
		

	}

}
