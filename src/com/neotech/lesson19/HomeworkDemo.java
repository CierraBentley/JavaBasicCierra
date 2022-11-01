package com.neotech.lesson19;

public class HomeworkDemo {

	public static void main (String args[]) {
	Homework st1 = new Homework();
	
	st1.studentName = "Cierra";
	st1.studentID = 1;
	
//	Increment the number of students 
	Homework.numberOfStudents++;
	
//	Don't do this :
//	st1.numberOfstudents++:	
	
	Homework st2 = new Homework();
	st2.studentName = "Savanah";
	st2.studentID = 2;
	Homework.numberOfStudents++;
	
	Homework st3 = new Homework();
	st3.studentName = "Chloe";
	st3.studentID = 3;
	Homework.numberOfStudents++;
	
	System.out.println("The total number of students is: " + Homework.numberOfStudents);
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}	
}
