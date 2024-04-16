import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.text.CollationElementIterator;
import java.util.ArrayList;

public class MapTest1 {
	

	public static void main(String[] args) {
		
		//Create map to store information about a car
		
		Map<String, String> car= new TreeMap<String, String>();
		
		//add information to the map
		car.put("Make", "Toyota");
		car.put("Model", "Camry");
		car.put("Year", "2018");
		car.put("Color", "Blue");
		car.put("Miles", "10000");
		
		//get information from the map
		car.get("Make");
		
		//remove information from the map
		//car.remove("Make");
		
		//returns the size of the map
		car.size();
		
		//returns true if the map is empty
		car.isEmpty();
		
		//returns true if the map contains the key
		car.containsKey("Make");
		
		//returns true if the map contains the value
		car.containsValue("Toyota");
		
		//returns a set of the keys
		
		//System.out.println(car.containsKey("Color"));
		
		//System.out.println(car);

		//Obtain all the keys from the map
		Set<String> keys=car.keySet();
		
		//Iterate through the keys and print each key
//		for (String key : keys) {
//			System.out.println(key + " : " + car.get(key));
//		}
		
		
		Set<String> values = car.keySet();
		
		for (String value : values) {
			System.out.println(value);
		}
		
		
	}

}
