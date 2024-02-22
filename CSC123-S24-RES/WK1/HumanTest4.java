//This class is to demonstrate the concept of pass by value

import java.util.Scanner;

public class HumanTest4 {

	public static void main(String[] args) {

		Human2 paul = new Human2("Paul", "Smith", "Black", "Red");
		int myBankBalance=1000;
		
		System.out.println(myBankBalance);
		changeBalance(myBankBalance);
		System.out.println(myBankBalance);
		
		System.out.println(paul);
		changeMyHairColor(paul);
		System.out.println(paul);
		
	}
	
	private static void changeBalance(int myBankBalance) {
		myBankBalance=2000;
	}

	private static void changeMyHairColor(Human2 h) {
		h.setHairColor("Golden");
	}
	
}
