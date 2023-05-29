package com.neotech.lesson26;

public class DoctorTest {

	public static void main (String [] args) {
		
		
		Doctor doc = new Doctor ();
		
		doc.setLicenseID(12345678L);
		System.out.println(doc.getLicenseID());
		
		//power of encapsulation
		doc.setEmail("");
		System.out.println(doc.getEmail());
		
		doc.setEmail("doctor@yahoo.com");
		System.out.println(doc.getEmail());
		
		doc.setEmail("doctor@gmail.com");
		System.out.println(doc.getEmail());
//HOW THIS WORKS -> 
//		"EMAIL CANNOT BE EMPTY" - null
//		"YOU HAVE TO USE GMAIL" - null
//		"DOCTOR@GMAIL.COM"
		
		
		//what happens is I do this? 
		
				doc.setEmail(" ");
				System.out.println(doc.getEmail());

		
		
		
		
		
	}
	
	
	
	
}
