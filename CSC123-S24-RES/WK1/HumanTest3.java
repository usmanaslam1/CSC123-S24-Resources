//This class is to demonstrate equals()

import java.util.Scanner;

public class HumanTest3 {

	public static void main(String[] args) {

		Human2 paul = new Human2("Paul", "Smith", "Black", "Red");
		Human2 paul2 = new Human2("Paul", "Smith", "Black", "Red");

		String myName = new String("Paul"); // 0xff10
		String myName2 = new String("Paul");// 0xff20

		if (myName.equals(myName2)) {
			System.out.println("Paul is here");
		} else {
			System.out.println("Paul is not here");
		}
		
		if(paul.equals(paul2)) {
            System.out.println("Paul is here");
		} else {
			System.out.println("Paul is not here");
		}
	}

}
