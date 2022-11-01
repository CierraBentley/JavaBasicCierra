package com.neotech.lesson11;

public class PrintArrays {

	public static void main(String[] args) {
	
		int [] points = {90, 85, 95, 75, 93, 95, 100};
		//printing one by one 
		System.out.println(points[0]);
		System.out.println(points[1]);
		System.out.println(points[2]);
		System.out.println(points[3]);
		System.out.println(points[4]);
		System.out.println(points[5]);
		System.out.println(points[6]);

		System.out.println("-----------------------------------");
				
		//BETTER WAY TO DO IT USING FOR LOOP		
				
				
		int size = points.length;
		
		for (int i = 0; i < size; i++)
		{
			System.out.println(points[i] + " ");
		}
		
		//HOW CAN WE GET THE SUM OF ALL VALUES
		//AND THE AVERAGE?
		
		int sum = 0;
		
		//sum = points[0] + points[1]...
		for (int i = 0; i < points.length; i++)
		{
			sum+= points[i];
		}
		System.out.println("The sum is: " + sum);
		System.out.println("The average is: " +sum/size);
		
		
		
		
		

	}

}
