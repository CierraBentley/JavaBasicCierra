package com.neotech.lesson17;

import java.util.Scanner;

public class Homework3 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
				
				System.out.println("Please enter the fathers name: ");
				String fname = scan.next();
				
				System.out.println("Please enter the mothers name: ");
				String mname = scan.next();
				
				System.out.println("Are you having a boy or a girl?");
				String baby = scan.next();
				
				if (baby.equals("boy"))
				{
					String firstHalf = fname.substring(0,fname.length()/2);
					String secondHalf = mname.substring(mname.length()/2);
					String boyName = firstHalf + secondHalf;
				System.out.println(boyName.toUpperCase());
					
					//short way	
				//String boyName = fname.substring(0, fname.length()/2).concat
				//(mname.substring(mname.length()/2));
				
				//System.out.println(boyName.toUpperCase());
				}
				else if (baby.equals("girl"))
				{
					String girlName = mname.substring(0,mname.length()/2) + 
							fname.substring(fname.length()/2);
					System.out.println(girlName.toUpperCase());
				}
				else 
				{
					System.out.println("Wrong entry!");
				}
		
		
		
		
	}

}
