package com.neotech.lesson13;

public class Task3 {

	public static void main(String[] args) {
	
//		Create a 2D array or integer type and
//		store numbers in 3 rows and 3 columns.
//		Print the sum of all numbers.	
		
		
	int [] [] N = {
			{3,4,5},
			{10,11,12},
			{7,8,9}
				  };
	//indexed for  loop 
	
	int sum = 0;
	for (int row = 0; row < N.length; row++)
	{
		for(int col = 0; col <N[row].length; col++)
		{
			sum += N[row][col]; //shorthand operator
		}
	}
	System.out.println("The total sum is: " + sum);	
		
		
	//enhanced for loop 
	
	int sum2 = 0;
	
	for(int[] row : N)
	{
		for (int value : row)
		{
			sum2 += value;
		}
	}
		System.out.println("The total sum is: " + sum2);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
