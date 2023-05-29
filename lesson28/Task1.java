package com.neotech.lesson28;

import java.util.ArrayList;
import java.util.Iterator;

public class Task1 {

	public static void main (String [] args) {
	
//		CREAT AND ARRAYLIST OF WORDS. REMOVES EVERY WORD THAT ENDS WITH E
//		USE ITERATOR
		
		ArrayList<String> words = new ArrayList();
		
		words.add("Hello");
		words.add("water");
		words.add("Sweet");
		words.add(1, "Apple");
		
		System.out.println(words);
		
		
		Iterator<String> iter = words.iterator();
		
		while(iter.hasNext())
		{
			String word = iter.next();
			
			if (word.endsWith("e"))
			{
				iter.remove();
			}
			
		}
		
		System.out.println(words);
		
	}


		
		
		
		
		
		
		
		
}
