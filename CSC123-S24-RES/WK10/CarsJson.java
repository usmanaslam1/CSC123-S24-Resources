import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

public class CarsJson {
	public static void main(String[] args) {
		
		//Create map to store information about a car
		
		JSONObject myCamry=new JSONObject();
		
		//add information to the map
		myCamry.put("Make", "Toyota");
		myCamry.put("Model", "Camry");
		myCamry.put("Year", "2018");
		myCamry.put("Color", "Blue");
		myCamry.put("Miles", "10000");
		
		System.out.println(myCamry);
		
		JSONArray wheels=new JSONArray();
		wheels.add("Front Left");
		wheels.add("Front Right");
		wheels.add("Back Left");
		wheels.add("Back Right");
		System.out.println(wheels);
		
		JSONObject corvette=new JSONObject();
		
		//add information to the map
		corvette.put("Make", "Corvette");
		corvette.put("Model", "C3");
		corvette.put("Year", "1976");
		corvette.put("Color", "Brown");
		corvette.put("Miles", "10000");
		corvette.put("Wheels", wheels);
	
		
		
		
		JSONArray garage = new JSONArray();
		
		garage.add(myCamry);
		garage.add(corvette);
		
		
		System.out.println(garage);
	}


}
