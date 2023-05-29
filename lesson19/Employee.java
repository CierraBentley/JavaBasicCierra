package com.neotech.lesson19;
public class Employee {

	
	public static String company; //public
	public String name;
	protected String lastName;
	double salary; //no access modifier it means default
	private int ssn;
//1.	if no access modifier, then it is default
//2.	the formula of assigning access modifier:
//		access modifier data_type variable name 
	
//		METHODS W/ DIFFERENT ACCESS MODIFIERS 
	public void method1()
	{
		System.out.println("I am a public method");
	}
	
	protected void method2()
	{
		System.out.println("I am a protected method");
	}

	void method3()
	{
		System.out.println("I am a default method");
	}
	
	private void method4()
	{
		System.out.println("I am a private method");
	}
	
	public static void main (String [] args) {
		
		Employee emp = new Employee();
		
		company = "Neotech";
		emp.name = "Cierra";
		emp.lastName = "Bentley";
		emp.salary = 122345;
		emp.ssn = 12345;
		
//		reading variables and methods
//		ex: red square 		ssn:int-employee
//		access modifier (private), identifier is ssn, type is int, belongs to employee

//		ACCESSING METHODS 		
		emp.method1(); //can access public  method
		emp.method2(); //can access a protected method
		emp.method3(); //can access default method
		emp.method4(); //can access private method
		
		
		
		
		
		
	}
}
