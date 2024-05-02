import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.http.HttpResponse.BodyHandlers;

public class SimpleAPIClientGET {

	public static void main(String[] args) throws Exception {
		
		String cityOrZip="New%20York";
		

		String url="https://weatherapi-com.p.rapidapi.com/current.json"+"?q="+cityOrZip;
		
		HttpResponse res = invokeAPI(url);
		System.out.println(res.body());
		
		

	}

	
	
	
	public static HttpResponse invokeAPI(String url) throws Exception {

		// STEP 1 - Build HTTP Request
		HttpRequest.Builder builder = HttpRequest.newBuilder();
		builder.uri(URI.create(url));
		builder.GET();
		
		
		builder.setHeader("X-RapidAPI-Key", "8bd2a7169amsh407ba58b10b6967p1f555ejsn7bd01ded4340");
		builder.setHeader("X-RapidAPI-Host", "weatherapi-com.p.rapidapi.com");
			
		
		//builder.header("User-Agent", "iPhone");
		HttpRequest req = builder.build();

		// STEP 2 - Send HTTP Request

		HttpClient client = HttpClient.newHttpClient();

		// Step 3 - Receive HTTP Response

		return client.send(req, BodyHandlers.ofString());

	}

}
