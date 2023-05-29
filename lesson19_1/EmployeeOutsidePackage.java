package com.neotech.lesson19_1;

import com.neotech.lesson19.Employee;

public class EmployeeOutsidePackage {
	public static void main (String [] args) {
		
		
		Employee.company = "Neotech";
		
		Employee emp = new Employee();
		
		emp.name = "Cierra";
	//	emp.salary = 122222; default so ant access outside package 
		//emp.ssn = 3333; //private so not visible
		emp.method1();
	//emp.method2();
	//emp.method3();		CANT ACCESS THESE
	//emp.method4();	
		
		
		
		
		
		
		
		
	}
}
