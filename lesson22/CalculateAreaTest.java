package com.neotech.lesson22;

public class CalculateAreaTest {

	public static void main (String [] args) {
	
		CalculateArea.area(5);
		CalculateArea.area(6,7);
		CalculateArea.area(5,6,7);
		
		//if we didn't use "static void" in CalculateArea then
		//we would need to make an object and then call methods (voids)
		
		
		//instance methods (last void in CA)
		
		CalculateArea ca = new CalculateArea();
		ca.area(5.5, 6.6);
		
		
	
	
}
}