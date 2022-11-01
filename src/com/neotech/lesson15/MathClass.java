package com.neotech.lesson15;

public class MathClass {

	public static void main(String[] args) {
		
		
		Calculator cal = new Calculator();
		
		System.out.println("Addition");
		cal.addition(5,  10);
		cal.addition(100, 90);
		
		System.out.println("Multiplication");
		cal.multiply(60, 4);
		cal.multiply(88, 44);

		System.out.println("Division");
		cal.divide(100, 4);
		cal.divide(8, 4);;
		
		
		
		
	}

}
