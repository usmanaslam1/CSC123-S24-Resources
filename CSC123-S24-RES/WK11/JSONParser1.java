import org.json.simple.JSONObject;
import org.json.simple.JSONArray;


import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class JSONParser1 {

	public static void main(String args[]) {
		
		JSONParser parser = new JSONParser();

		String jsonString = "{\"name\":\"John\",\"age\":30,\"gender\":\"male\"}";
		//String jsonString = "[\"name\",\"John\",\"age\",30,\"gender\",\"male\"]";

		try {
			  //Convert JSON string to some object
			
			 Object obj = parser.parse(jsonString);
			 JSONObject jsonObject = (JSONObject) obj;

		
			String name = (String) jsonObject.get("name");
			System.out.println("Name: " + name);

			long age = (Long) jsonObject.get("age");
			System.out.println("Age: " + age);

			String gender = (String) jsonObject.get("gender");
			System.out.println("Gender: " + gender);

		} catch (ParseException e) {
			e.printStackTrace();
		}
		
		
	}
}
