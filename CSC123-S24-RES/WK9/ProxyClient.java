import java.net.Socket;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;

public class ProxyClient {
	public static void main(String[] args) throws Exception{
		
		try {
			//Creacket socket
            Socket sock = new Socket("localhost", 1200);
            
            //Create streams
            OutputStream out = sock.getOutputStream();
            InputStream in = sock.getInputStream();
            
            //Data
            String httpRequest="GET / \n";
            
            //Send Datat
            writeData(out, httpRequest);
            
            
            //Receive Data
            String response = readData(in);
            System.out.println("Server said: " + response);
            
            
            sock.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
	}


	
	// read data from the client

	private static String readData(InputStream in) throws IOException {

		BufferedReader reader = new BufferedReader(new InputStreamReader(in));
		
		String line="";
		StringBuffer output = new StringBuffer();
		
		while ((line = reader.readLine()) != null) {
			output.append(line+"\n");
		}
		
		return output.toString();

	}
	
	private static void writeData(OutputStream out, String data) throws IOException {
		out.write(data.getBytes());
		out.write('\n');
		out.flush();
	}

}
