package com.neotech.lesson20;

public class Student {
//Write a program of Class Students that takes students name and 3 subject grades.
//Inside your class also have a method to calc average grade 
	//test student class for 5 dif studnets with dif marks
	//ur program should print an average mark for each studrnt name
	
	String name;
	int grade1, grade2, grade3;
	
	Student()
	{
	}
	
	Student(String studentName, int g1, int g2, int g3)
	{
		name = studentName;
		grade1 = g1;
		grade2 = g2;
		grade3 = g3;
	}
	
	int average()
	{
		return (grade1+grade2+grade3)/3;
	}
	
	public static void main (String [] args) {
		
		Student st1 = new Student ("Cierra", 95, 98, 97);
		Student st2 = new Student ("Berkant", 88, 97, 99);
		Student st3 = new Student ("Savannah", 99, 90, 95);
		
		System.out.println(st1.name + " has an average of " + st1.average());
		System.out.println(st2.name + " has an average of " + st2.average());
		System.out.println(st3.name + " has an average of " + st3.average());
		
		
		
	}
}
