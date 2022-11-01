package com.neotech.lesson14;

public class School {

	public static void main(String[] args) {

		Student s1 = new Student();
		Student s2 = new Student();
		Student s3 = new Student();
		
		s1.firstName = "Cierra";
		s1.lastName = "Bentley";
		s1.school = "Neotech Academy";
		s1.studentId = 1;
		s1.grade = 'A';
		s1.gender = 'F';
		
		s1.doHomework();
		s1.study();
		
		s2.firstName = "Savannah";
		s2.lastName = "Bentley";
		s2.school = "Cape Cod Community College";
		s2.studentId = 2;
		s2.grade = 'A';
		s2.gender = 'F';
		
		s2.doHomework();
		s2.study();
		
		s3.firstName = "Berkant";
		s3.lastName = "Damat";
		s3.school = "Neotech Academy";
		s3.studentId = 3;
		s3.grade = 'A';
		s3.gender = 'M';
		
		s3.doHomework();
		s3.study();
		
// 	PRINTS 
//		Cierra is doing homework
//		Cierra Bentley is studying
//		Savannah is doing homework
//		Savannah Bentley is studying
//		Berkant is doing homework
//		Berkant Damat is studying
		
		
		
		
		
		
		
		
	}

}
