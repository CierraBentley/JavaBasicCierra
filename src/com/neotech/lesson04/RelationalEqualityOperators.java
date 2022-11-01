package com.neotech.lesson04;

public class RelationalEqualityOperators {
public static void main (String [] args) {
	
	System.out.println(6>8);//FALSE
	int a = 6;
	int b = 8;
	
	System.out.println(a>b);//FALSE
	System.out.println(b>a);//TRUE
	
	int c = 8;
	System.out.println(c>b);//FALSE
	System.out.println(c== b); //TRUE
	System.out.println(c != b);//FALSE
	
	System.out.println("---------------------");
	
	
	double d1 = 10.3;
	double d2 = 10.3;
	
	boolean result1 = (d1>d2); //FALSE
	System.out.println(result1);
	
	boolean result2 = (d1 == d2);
	System.out.println(result2); //TRUE 
	
	boolean result3 = (d1<=d2); 
	System.out.println(result3);//TRUE
	
	boolean result4 = d1 >= d2;
	System.out.println(result4); //FALSE;
	
	
}
}
