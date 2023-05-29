package com.neotech.lesson32;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class Homework1 {

	public static void main(String[] args) {

//	Create a Map that will store Employee name and salary. 
//		Write a logic to retrieve an employee who gets the highest salary. 
//		Output should be in the below format
//		- John Smith=$100000		
		
		
		Map<String, Integer> emp = new HashMap<>();
		
		emp.put("John", 75000);
		emp.put("Cierra", 120000);
		emp.put("Berkant", 1300000);
		emp.put("Savannah", 75000);
		
//	Find the largest value in map
		Collection<Integer> salaries = emp.values();
		
		int max = 0;
//	Use enhanced for loop
		for (int s: salaries)
		{
			if (s > max)
			{
				max = s;
			}
		}
		
		System.out.println("The maximum salary is: " + max);
		
//		System.out.println(Collections.max(emp.values())); => FASTER WAY
		
//	We found the largest, now need to find the employees name!		
		
		Iterator<Entry<String, Integer>> it = emp.entrySet().iterator();
		Entry<String, Integer> maxEntry = it.next();
		
		while(it.hasNext()) 
		{
			Entry<String, Integer> entry = it.next();
			
			if (entry.getValue() > maxEntry.getValue())
			{
				maxEntry = entry;
			}
		}
		
		System.out.println("The maximum value entry is: " + maxEntry.getKey() + " =$" + max);
		System.out.println(maxEntry);
		
		
		
		
	}

}
