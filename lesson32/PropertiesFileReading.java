package com.neotech.lesson32;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Collection;
import java.util.Properties;
import java.util.Set;

public class PropertiesFileReading {

	public static void main (String [] args) throws IOException{
		
		//here is my .properties file located?
		
		String filePath = "/Users/msipc/Documents/GitHub/JavaBasic4/example.properties";
		
		//2. create an object of FileInputStream 
		
		FileInputStream fis = new FileInputStream(filePath);
		
		//3. to handle .properties file; we need to use a Properties java class
		
		Properties prop = new Properties();
		
		//4. load everything in .properties file with oad() method 
		prop.load(fis);
		
		String name = prop.getProperty("name");
		System.out.println(name);
		
		String lastName = prop.getProperty("lastName");
		System.out.println(lastName);
		
		Set<Object> keys = prop.keySet();
		Collection<Object> values = prop.values();
		
		
		
		
		
		
		
	}
}
