import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.text.CollationElementIterator;
import java.util.ArrayList;

public class MapTest4 {
	

	public static void main(String[] args) {
		
		//Create map to store information about a car
		
		Map<String, String> car= new HashMap<String, String>();
		ArrayList<Map> garage = new ArrayList<Map>();
		
		//add information to the map
		car.put("Make", "Toyota");
		car.put("Model", "Camry");
		car.put("Year", "2018");
		car.put("Color", "Blue");
		car.put("Miles", "10000");
		car.put("Radio", "Digital Radio");

		garage.add(car);
		
		car= new HashMap<String, String>();
		car.put("Make", "Ford");
		car.put("Model", "Focus");
		car.put("Year", "2017");
		car.put("Color", "Red");
		car.put("Miles", "20000");
		car.put("Radio", "Digital Radio");
		
		garage.add(car);
		
		car= new HashMap<String, String>();
		car.put("Make", "Honda");
		car.put("Model", "Accord");
		car.put("Year", "2016");
		car.put("Color", "Black");
		car.put("Miles", "30000");
		car.put("Radio", "Digital Radio");
		
		garage.add(car);
		
		
//		for (Map carMap : garage) {
//			System.out.println(carMap);
//		}
//		
//	
		
		System.out.println(garage);
	}

}
