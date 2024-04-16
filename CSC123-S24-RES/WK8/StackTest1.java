import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.Stack;
import java.util.TreeSet;
import java.text.CollationElementIterator;
import java.util.ArrayList;

public class StackTest1 {
	

	public static void main(String[] args) {
		
		//Create map to store information about a car
		
		Stack<Integer> numbers= new Stack<Integer>();

		numbers.push(1);
		numbers.push(2);
		numbers.push(3);
	    numbers.push(4);
	    numbers.push(5);

		while (!numbers.isEmpty()) {
			System.out.println(numbers.pop());
		}
	
		
		
	}

}
