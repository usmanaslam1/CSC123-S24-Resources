import java.util.Arrays;
import java.util.ArrayList;

public class ArrayList1 {
	

	public static void main(String[] args) {
		
		ArrayList<String> list = new ArrayList<String>();

		list.add("Tomatos");
		list.add("Potatos");
		list.add("Carrots");
		list.add("Onions");
		
		//adds to item end of the list
		//adds item to a specific index
		list.get(0);
		//remove item from specific index
		//list.remove(0);
		//returns the size of the list
		list.size();
		//returns the index of the item
		list.indexOf("World");
		//replaces the item at the index
		list.set(0, "Goodbye");
		//clears the list
		//list.clear();
		//returns true if list is empty
		list.isEmpty();
		//returns true if list contains the item
		list.contains("World");
		list.toArray();
		
		
	
	   for(String item:list) {
		               System.out.println(item);
	   }
		

		
	}

}
