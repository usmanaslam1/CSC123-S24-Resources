import java.util.Scanner;

public class HumanTest {
	
	public static void main(String[] args) {
		
		Human paul=new Human("Paul", "Smith", "Brown","Red");
		
		
		System.out.println(paul.getFullName());
		
		
		
	    Human paul2=new Human("Paul", "Smith", "Brown","Red");
		
		paul2.setHeightInFeet(5);
		paul2.setHeightInInches(11);
		
		
		Human marry=new Human("Marry", "Smith", "Blonde","Black");
		
		marry.setHeightInFeet(5);
		marry.setHeightInInches(9);
			
		
	
	}
}
