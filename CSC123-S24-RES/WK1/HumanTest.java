import java.util.Scanner;

public class HumanTest {
	
	public static void main(String[] args) {
		
		Human2 paul=new Human2("Paul", "Smith", "Brown","Red");
		
		
		System.out.println(paul.getFullName());
		
		
		
	    Human2 paul2=new Human2("Paul", "Smith", "Brown","Red");
		
		paul2.setHeightInFeet(5);
		paul2.setHeightInInches(11);
		
		
		Human2 marry=new Human2("Marry", "Smith", "Blonde","Black");
		
		marry.setHeightInFeet(5);
		marry.setHeightInInches(9);
			
		
	
	}
}
