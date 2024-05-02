import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.http.HttpResponse.BodyHandlers;
import java.util.Map;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class SimpleAPIClient2 {

	public static void main(String[] args) throws Exception {

	
		// STEP 1 - Use scanner class to ask for Input (customer id)
		// STEP 2 - Use SimpleJson Library to create a Json document
		// STEP 3 - Invoke the document on the API given below
		
		
		// STEP 4 - Print results 
		
		
		String json="{\"cust_id\":\"5000\"}";
		
		
		HttpResponse<String> res = invokeAPI(json);
		
		int statusCode = res.statusCode();
		String bodyJson = res.body();
		Map headers = res.headers().map();
		
		if(statusCode != 200) {
            System.out.println("Something wrong happened");
            System.exit(1);
		}
		
		JSONParser parser=new JSONParser();
		Object obj = parser.parse(bodyJson);
		
		JSONObject jsonRoot = (JSONObject) obj;
		JSONObject body=(JSONObject)jsonRoot.get("body");
		
		System.out.println("Status Code : "+jsonRoot.get("status"));
		System.out.println("Message : "+jsonRoot.get("message"));
		System.out.println("City : "+body.get("city"));
		
		
		
		
		

	}

	
	
	
	public static HttpResponse invokeAPI(String json) throws Exception {

		// STEP 1 - Build HTTP Request
		HttpRequest.Builder builder = HttpRequest.newBuilder();
		builder.uri(URI.create("https://e3m1dkivq8.execute-api.us-west-1.amazonaws.com/Production/get-record"));
		
		
		builder.POST(HttpRequest.BodyPublishers.ofString(json));
		
		
		builder.setHeader("x-api-key", "RdOufnPVRh7ns4WzLWk509UFrx9nL9aZ2jFBDMP5");
		
		//builder.header("User-Agent", "iPhone");
		HttpRequest req = builder.build();

		// STEP 2 - Send HTTP Request

		HttpClient client = HttpClient.newHttpClient();

		// Step 3 - Receive HTTP Response

		return client.send(req, BodyHandlers.ofString());

	}

}
