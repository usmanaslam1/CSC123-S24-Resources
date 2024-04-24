import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public class Worker extends Thread{
	InputStream in;
	OutputStream out;
	Socket sock;
	
	public Worker(Socket sock) throws  IOException {

		this.sock = sock;
		this.in = sock.getInputStream();
		this.out = sock.getOutputStream();
	}
	
	@Override
	public void run() {
		try {
			serviceClient();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public void serviceClient() throws IOException {
		String clientRequest = "";
		
		writeData(out,"Hello, I am "+getName()+", I will be serving you today\n");
		
		while (!clientRequest.strip().equalsIgnoreCase("quit")) {
			// read data from the client
			clientRequest = readData(in);
			String clientResponse = "You  Said: " + clientRequest;

			// send data to the client
			writeData(out, clientResponse);
		}
		if(sock!=null) sock.close();
	}
	
	private  void writeData(OutputStream out, String data) throws IOException {
		out.write(data.getBytes());
		out.write('\n');
		out.flush();
	}

	// read data from the client

	private  String readData(InputStream in) throws IOException {

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


}
