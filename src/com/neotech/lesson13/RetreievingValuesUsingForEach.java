package com.neotech.lesson13;

public class RetreievingValuesUsingForEach {

	public static void main(String[] args) {

	String [][] animals = { {"cat", "dog", "bird"}, {"tiger", "lion", "bear"}, {"salmon", "seabass", "shrimp"}};	
		//how to get number of rows
		int rows = animals.length;
	
		
		//how to get the number of columns for first row 
		int first_row_cols = animals[0].length;
		int second_row_cols = animals[1].length;
		int third_row_cols = animals[2].length;
		
		//how to get specific value (lion)
		String lion = animals[1][1];
		
		//how to print all values
		
		for(int row = 0; row < animals.length; row++) //goes through all rows
		{
			for(int col = 0; col < animals[row].length; col++) //goes through all cols
			{
				System.out.print(animals[row][col] + " " );
			}
			System.out.println();
		} 			// PRINTS
				// cat dog bird
				// tiger lion bear 
				// salmon seabass shrimp
		
		System.out.println();
		
		
		
		
		
		
		
		System.out.println("USING FOR EACH LOOP");
		//USING   FOR   EACH   LOOP
		
	for (String[] row : animals) //for each string array row of animals
	{
		for(String animal : row) //for each String in the current row 
		{
			System.out.print(animal + " ");
		}
		System.out.println();
	}				// PRINTS
			// cat dog bird
			// tiger lion bear 
			// salmon seabass shrimp

	//USING FOR EACH IN 2D ARRAYS - E X P L A N A T I O N 
	//first loop (1D array : 2D array)
	//second (nested) for loop (String value : 1D array)
		
	
	
	
	
	System.out.println();
	
	//ANOTHER EXAMPLE
	System.out.println("ANOTHER 2D ARRAY EXAMPLE ");
	int[][] grades = {     //DID LIKE THIS TO SHOW 'TABLE' BETTER
			{95, 78, 85}, 
			{100, 68, 89, 90},
			{75, 78}, 
			{55, 89, 76, 80, 50}};

	//2D array {   {value1, vale2}, {}
	
	for (int []row : grades)
	{
		for(int grade : row)
		{
			System.out.print(grade + " ");
		}
		System.out.println();
	}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
