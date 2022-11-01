package com.neotech.lesson19;

public class EmployeeWithinPackage {

	public static void main(String[] args) {
	
		Employee emp = new Employee ();
		
		Employee.company = "Neotech";
		emp.name = "Cierra";
		emp.lastName = "Bentley";
		emp.salary = 123455;
	//	emp.ssn = 22222;
		//THIS IS NOT VISIBLE BC IT IS PRIVATE IN THE CLASS "EMPLOYEE"
		
		//ACCESSING METHODS
		emp.method1(); //yes
		emp.method2(); //yes
		emp.method3();//yes
	//	emp.method4(); NO - PRIVATE
		
		
		
		
		
		

	}

}
