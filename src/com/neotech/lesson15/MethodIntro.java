package com.neotech.lesson15;

public class MethodIntro {
	
	void greet()
	{
		System.out.println("Hello");
		System.out.println("How are you?");
		System.out.println("Bye!");
	}
		
	void greet2(String name)
	{
		System.out.println("Hello " + name);
		System.out.println("How are you, " + name);
		System.out.println("Bye " + name);
	}
		
	

	

	public static void main(String[] args) {

	//calling a method
		MethodIntro obj = new MethodIntro();
		obj.greet();

		obj.greet2("Cierra");
		obj.greet2(" ");
		String name = "James";
		obj.greet2(name);
		
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
