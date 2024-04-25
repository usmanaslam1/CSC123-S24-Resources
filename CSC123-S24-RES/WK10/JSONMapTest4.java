import org.json.simple.JSONObject;
import org.json.simple.JSONArray;

public class JSONMapTest4 {
	

	public static void main(String[] args) {
		
		//Create map to store information about a car
		
		JSONObject car= new JSONObject();
		JSONArray garage = new JSONArray();
		
		garage.add("Apples");
		garage.add("Soda");
		//add information to the map
		car.put("Make", "Toyota");
		car.put("Model", "Camry");
		car.put("Year", "2018");
		car.put("Color", "Blue");
		car.put("Miles", "10000");
		car.put("Radio", "Digital Radio");

		garage.add(car);
		
		car= new JSONObject();
		car.put("Make", "Ford");
		car.put("Model", "Focus");
		car.put("Year", "2017");
		car.put("Color", "Red");
		car.put("Miles", "20000");
		car.put("Radio", "Digital Radio");
		garage.add("John Shi");
		garage.add(car);
		
		car= new JSONObject();
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
