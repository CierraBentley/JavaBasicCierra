package com.neotech.lesson32;

import java.util.LinkedHashSet;
import java.util.Set;

public class Homework2 {

	public static void main (String [] args) {
		
//	Create the collection that will store single unique objects of a String type in which order is preserved.
//	    Write a logic to concatenate all string from the collection.
		
		
		Set<String> set = new LinkedHashSet<>();
		set.add("Today");
		set.add("we");
		set.add("have");
		set.add("a");
		set.add("class");
		
		String output = "";
		for (String str : set) 
		{
			output+= str + " ";
		}
		
		System.out.println(output);
		
		
		
		
		
		
		
		
		
		
		
	}
}
