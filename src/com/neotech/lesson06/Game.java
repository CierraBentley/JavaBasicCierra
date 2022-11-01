package com.neotech.lesson06;

import java.util.Scanner;

public class Game {
	
	public static void main (String [] args) {
	
	System.out.println("Welcome to the 21");
	
			System.out.println("How do you play the game count to 21?");
			System.out.println("The first player starts by counting to a number up to 3 (e.g \"one, two\")");
			System.out.println(
					"The second player carries on counting, adding up to, or including three consecutive numbers at a time (e.g \"three, four, five\")");
			System.out.println("This continues until someone reaches the number 21. At this point they lose.");
			Scanner input = new Scanner(System.in);
			System.out.println(" ");
			System.out.println("Start with your number (1 or 12 or 123)");
			System.out.println(" ");
			int number = input.nextInt();
			if (number == 1) {
				System.out.println(234 + "   (5 or 56 or 567)");	
				} else if (number == 12) {
				System.out.println(34 + "   (5 or 56 or 567)");
				
			} else if (number == 123) {
				System.out.println(4 + "   (5 or 56 or 567)");
			}
			
			System.out.println(" ");////////////////////////////////////
	
			int number4 = input.nextInt();
			if (number4 == 5) {
				System.out.println(678 + "   (9 or 910 or 91011)");
			} else if (number4 == 56) {
				System.out.println(78 + "   (9 or 910 or 91011)");
			} else if (number4 == 567) {
				System.out.println(8 + "   (9 or 910 or 91011)");
			}
			
			System.out.println(" ");//////////////////////////////////
			int number6 = input.nextInt();
			if (number6 == 9) {
				System.out.println(101112 + "   (13 or 1314 or 131415)");
			} else if (number6 == 910) {
				System.out.println(1112 + "   (13 or 1314 or 131415)");
			} else if (number6 == 91011) {
				System.out.println(12 + "   (13 or 1314 or 131415)");
			}
			
			System.out.println(" ");//////////////////////////////////
			int number7 = input.nextInt();
			if (number7 == 13) {
				System.out.println(141516 + "   (17 or 1718 or 171819)");
			} else if (number7 == 1314) {
				System.out.println(1516 + "   (17 or 1718 or 171819)");
			} else if (number7 == 131415) {
				System.out.println(16 + "   (17 or 1718 or 171819)");
			}
			System.out.println(" ");//////////////////////////////////
			int number8 = input.nextInt();
			if (number8 == 17) {
				System.out.println(181920);
			} else if (number8 == 1718) {
				System.out.println(1920);
			} else if (number8 == 171819) {
				System.out.println(20);
			}
			
			System.out.println("You have to say 21-->");
			int number9 = input.nextInt();
			if (number9 == 21) {
				System.out.println("   #     ##   ####  ###  ####    -   -      ");
				System.out.println("   #    #  #   #    #__  #       *   *      ");
				System.out.println("   #    #  #    #   #    #         ^        ");
				System.out.println("   ###   ##   ####  ###  #       {---}      ");
				
				System.out.println(" ");
				System.out.println("Press 1 If you want to play a different game");////////////////////////////////
				int newNumber = input.nextInt();
				if (newNumber != 1) {
					System.out.println("Have a Good Day");
				} if (newNumber == 1) {
					
					System.out.println("Lets Goo");
					System.out.println("Guess Any Number and Write Here :");
					int guessNum = input.nextInt();
					System.out.println("Multiply By 5 :");
					
					int guessNum2 = input.nextInt();
					System.out.println("Now Add 7 on your new number :");
					
					int guessNum3 = input.nextInt();
					System.out.println("Double your new number : ");
					
					int guessNum4 = input.nextInt();
					System.out.println("Your first number was :" + " " + (guessNum4 - 14) / 10); 
				} } 
			
			}
		
}
