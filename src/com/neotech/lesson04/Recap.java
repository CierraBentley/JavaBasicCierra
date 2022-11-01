package com.neotech.lesson04;

public class Recap {
public static void main (String [] args) {
	
	//Declaring and assigning a value to a variable
	String str = "Good morning";
	System.out.println(str); //This will print Good morning 
	
	//re-assigning a value to the previously declared variable 
	str = "Good afternoon"; 
	System.out.println(str);
	
	
	//Arithmetic Operators - +. -, /, *, % -> applicable for numeric data types
	//Order of operations PEMDAS
	
	int num1 = 5 + 5 +5;
	System.out.println(num1);
	
	int num2 = 5 + 5 * 5;
	System.out.println(num2);
	
	int num3 = (5+5) * 5;
	System.out.println(num3);
	
	int num4 = 5 * 5 + 5 / 5;
	System.out.println(num4);
	
	int num5 = 8 / 2 * (2+2);
	System.out.println(num5);
	
	int number1 = 15;
	int number2 = 4;
	
	int div = number1 / number2; //3.75
	System.out.println(div);
	System.out.println("div -->" + div);
	double div2 = number1 / number2;
	System.out.println(div2);
	
	int rem = number1 % number2; 
	System.out.println(rem);
	System.out.println("rem -->" + rem);
	int rem2 = 19 % 6; // 19/6 = 3; 3*6 = 18; 19-18=1; 
	System.out.println(rem2); 
	
	int rem3 = 19%7; //19/7=2; 2*7=14; 19-14=5
	System.out.println(rem3);
	
	int rem4 = 347562878 % 5; 
	System.out.println(rem4);
	
	
	//CONCATENATION
	
	int a = 10;
	int b = 20;
	String x = "Java";
	String y = "Sunday";
	boolean z = true;
	
	System.out.println(x + y); //JavaSunday
	System.out.println(x + y + a); //JavaSunday10
	System.out.println(x + z); //Javatrue
	System.out.println("Java" + 10 + 5); //Java105
	System.out.println("Java" + (10+5)); //Java15
	System.out.println(x + y + a + b);// JavaSunday1020
	System.out.println(a + b + x + y);//30JavaSunday --> b/c Java goes left to right 
										// it adds to two int together and gives 30 	
	System.out.println("" + a + b + x + y);//1020JavaSunday
	System.out.println(x+y+a*b); //JavaSunday200 b/c multiplication is done first 
	System.out.println("Cierra" + 3 + 3);//Cierra33
	System.out.println("Cierra" + 3 * 3);//Cierra9
	
	//DIFFERENCE BETWEEN CHAR AND STRING
	char c2 = ' ' ; //Space is a character
	//char c2 = ''; ERROR for char with zero inside 
	
	String emptyStr = ""; // String can be empty Zero characters
	String spaceStr = " ";
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
}
