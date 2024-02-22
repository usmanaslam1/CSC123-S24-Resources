//This class is to demonstrate the concept of pass by value

import java.util.Scanner;

public class HumanTest5 {

	public static void main(String[] args) {
		
		int x=10;
		int y=x;
	    x=x+1;
		
		System.out.println(x);
		System.out.println(y);
		
		if(x==y) {
			System.out.println("x and y are equal");
        } else {
            System.out.println("x and y are not equal");
        }
		}
		
	
}
