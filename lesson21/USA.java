package com.neotech.lesson21;

public class USA {

	//8instance variables 
	String state, stateCapital;
	
	//constructor 
	public USA (String state, String stateCapital) 
	{
		this.state = state;
		this.stateCapital = stateCapital;
	}
	
	//methods
	public void displayState()
	{
		System.out.println(state);
	}
	public void displaystateCapital() 
	{
		System.out.println(stateCapital);
	}
	
	public void displayInfo()
	{
		this.displayState();
		this.displaystateCapital();
	}

	public static void main (String [] args) {
	
		
		USA us1 = new USA ("Massachusetts", "Boston");
		us1.displayInfo();
		
		System.out.println("-----------------");
		USA us2 = new USA ("Maine", "Augusta");
		us2.displayInfo();
		
		
		
		
		
		
		
		
		
		
	}
	
}
