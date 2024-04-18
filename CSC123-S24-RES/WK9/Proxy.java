import java.net.ServerSocket;
import java.net.Socket;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;

public class Proxy {

	public static void main(String[] args) throws IOException {
		// listen on port 1200
		ServerSocket server = new ServerSocket(1201);
		while (true) {

			// accept a connection from a client
			Socket sock = server.accept(); // this will block until a client connects

			// get input and output streams
			InputStream in = sock.getInputStream();
			OutputStream out = sock.getOutputStream();

			// read data from the client

			String clientRequest = readLine(in);
			
			System.out.println("Client said: " + clientRequest);
			
			String clientResponse = "You  Said: " + clientRequest;
			

			//PROXY CODE-----------------------------------
			
			//Creacket socket
            Socket proxyClientsock = new Socket(clientRequest.strip(), 80);
            
            //Create streams
            OutputStream proxyClientOut = proxyClientsock.getOutputStream();
            InputStream proxyClientIn = proxyClientsock.getInputStream();
            
            //Data
            String httpRequest="GET / \n\n";
            
            //Send Datat
            writeData(proxyClientOut, httpRequest);
            
            
            //Receive Data
            String responseFromWebsite = readData(proxyClientIn);

			
          //PROXY CODE ENDS-----------------------------------
			
			// send data to the client
			writeData(out, responseFromWebsite);
			sock.close();
		}
	}

	private static void writeData(OutputStream out, String data) throws IOException {
		out.write(data.getBytes());
		out.write('\n');
		out.flush();
	}

	private static void writeDataChatGPTStyle(OutputStream out, String data) throws Exception {
	
		byte[] dataBytes= data.getBytes();
		
		for(byte b: dataBytes) {
			out.write(b);
			Thread.sleep(200);
		}
		out.write('\n');
		out.flush();
	}

	
	// read data from the client

	private static String readLine(InputStream in) throws IOException {

		int byteRead;
		StringBuffer output = new StringBuffer();

		while ((byteRead = in.read()) != -1) {
			if (byteRead == '\n') {
				break;
			}
			output.append((char) byteRead);
		}
		return output.toString();

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

}
