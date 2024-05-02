import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.http.HttpResponse.BodyHandlers;
import java.util.Scanner;

import org.json.simple.JSONObject;

public class SimpleAPIClientUI {

	public static void main(String[] args) throws Exception {
		
		
		System.out.println("Welcome to User Seach Program!!!!");

		JSONObject json = new JSONObject();
		Scanner scanner = new Scanner(System.in);
		while(true) {
			System.out.print("\n\nEnter Customer ID to search:");
			
			String cust_id = scanner.nextLine();
			json.put("cust_id", cust_id);
			json.put("first_name", "John");
			
			System.out.println("You typed and I made a JSON:" + json.toJSONString());
			System.out.println("\n\nCalling API!!!");
			HttpResponse<String> res = invokeAPI(json.toJSONString());
			System.out.println("\nHere is your result!!!\n\n");
			System.out.println(res.body());
			
			
			
		}
		
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
