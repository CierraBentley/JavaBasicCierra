package com.neotech.lesson21;

public class School {

	public static void main(String[] args) {

		//1st constructor is used
		
		Student st1 = new Student ();
		
		st1.displayInfo();
		
		st1.name = "Cierra";
		st1.address = "222 Main St";
		st1.displayInfo();
		
		System.out.println("-------------");
		
		Student st2 = new Student ("Berkant", "111 Main St");
		st2.displayInfo();
		
		Student st3 = new Student ("Savannah", "333 Main St");
		st3.displayInfo();
		
		
	}

}
