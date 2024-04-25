
import org.json.simple.JSONObject;

public class JSONMapTest3 {
	

	public static void main(String[] args) {
		
		//Create map to store information about a car
		
		JSONObject car= new JSONObject();
		
		//add information to the map
		car.put("Make", "Toyota");
		car.put("Model", "Camry");
		car.put("Year", "2018");
		car.put("Color", "Blue");
		car.put("Miles", "10000");
		System.out.println(car);
		
		
		
	}

}
