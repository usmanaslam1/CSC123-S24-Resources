//This class is to demonstrate the concept of pass by value

import java.util.Scanner;

public class HumanTest6 {

	public static void main(String[] args) {
		
		Human2 paul = new Human2("Paul", "Smith", "Black", "Red");
		Human2 paul2 = new Human2("Paul", "Smith", "Black", "Red");
		Human2 paul3=paul2;
		Human2 paul4=paul2;
		Human2 paul5=paul2;
		
		paul=paul2;
		paul2.setEyeColor("ULTRA VIOLATE");
		
		if (paul == paul2) {
			System.out.println("Both Pauls are the same");
		} else {
			System.out.println("Pauls are different");
		}
		
		
		System.out.println(paul.getEyeColor());

	}	
}
