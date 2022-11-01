package com.neotech.lesson04;

public class CompoundOperator {
public static void main (String [] args) {
	
	//COMPOUND OPERATOR
	//ALSO KNOWN AS SHORTHAND OPERATOR
	
	int num = 100; //store 100 into a container
	
	num = num +100; //add 100 to the value inside the container (long way)
	System.out.println(num);
	
	num = num + 100;
	System.out.println(num);//300 

	// we can use compound/shorthand operator 
	num +=60; // add 60 to the container 
	System.out.println(num);//360
	num =+ 60;
	System.out.println(num);//60
	
	num = num / 7; //long way
	num /= 7; //short way 
	System.out.println(num);

	//modulus operator 100mod 9 =1 
	//num = num %9;
	num %=9;
	System.out.println(num);//1
	//The remainder is 1 
	
	
	
	
	
	
	
	
}
}
