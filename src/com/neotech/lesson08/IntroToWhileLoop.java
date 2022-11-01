package com.neotech.lesson08;

public class IntroToWhileLoop {

	public static void main(String[] args) {

	int time = 8;
	
	if (time < 9) 
	{
		System.out.println("Good evening");
	}
		
	while (time < 12) ///condition
		//when the condition is false, it stops printing
	{//beginning of while body
		System.out.println(time);//stopped printing at 11
		time ++;
		//time = time + 2;
		//time +=2;
	}//ending of while body
		
		int a = 20;
		while (a <30) //a <=29
		{
			System.out.println("Condition: " + (a<30));
			System.out.print(a + " ");
			a++;
		}
		
		//How do we print numbers 5 to 25?
		System.out.println(); //making a space in code
		int b = 5;
		
		while (b <= 25)
		{
			System.out.print(b + " " );
			b++;
		}
		
		System.out.println();//making a space in code
		//how can we print numbers 10 to 1
		
		int c = 10;
		
		while (c>= 1)
		{
			System.out.print(c + " ");
			c--;
		}
		
		
		System.out.println();
		//How can i print only even numbers from 50 to 1?
		
		int e = 50;
		
		while (e >= 1);
		{
		 if (e % 2 == 0 )
		 {
			 System.out.print(e + " ");
		 }
		 e--;
		}
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
