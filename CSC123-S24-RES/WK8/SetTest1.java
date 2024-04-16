import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;
import java.text.CollationElementIterator;
import java.util.ArrayList;

public class SetTest1 {
	

	public static void main(String[] args) {
		
		//Create map to store information about a car
		
		Set<String> fruits= new TreeSet<String>();
		
		
		fruits.add("Apple");
		fruits.add("Banana");
		fruits.add("Orange");
		fruits.add("Grapes");
		fruits.add("Grapes");
		
		fruits.remove("fruits");
		fruits.contains("Apple");
		fruits.size();
		fruits.isEmpty();
		//fruits.clear();
		
		for (String fruit : fruits) {
			System.out.println(fruit);
		}
		
		
		
		

		
	}

}
