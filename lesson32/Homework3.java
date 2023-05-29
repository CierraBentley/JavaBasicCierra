package com.neotech.lesson32;

import java.util.ArrayList;
import java.util.List;

public class Homework3 {

	public static void main (String [] args) {
		
//	Create a collection of integers in which you can keep duplicates. 
//	    Write a logic to find sum of all integers		
		
		List<Integer> al = new ArrayList<>();
		
		al.add(35);
		al.add(24);
		al.add(35);
		al.add(15);
		al.add(20);
		
		System.out.println(al);
		
		int sum = 0; 
		
		for (Integer i: al)
		{
			sum+= i;
		}
		
		System.out.println("The sum of all elements in the array list is: " + sum);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
