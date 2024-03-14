import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.FileInputStream;


//Try to read entire file in one go
public class FileTest4 {

	public static void main(String[] args) throws IOException {

		File f = new File("/Users/usman/test123/file.txt");

		if (!f.exists()) {
			System.out.println("File does not exist!");
			System.exit(0);
		}
		
		if (!f.isFile()) {
			System.out.println("Not a file!!");
			System.exit(0);
		}
		
		if (!f.canRead()) {
			System.out.println("Can't read file!!");
			System.exit(0);
		}

		InputStream in=new FileInputStream(f);
		
		//Number of bytes available to read
		
		int bytesAvailable=in.available();
		
		//empty array of bytes
		byte[] bytes=new byte[bytesAvailable];
		
		//ask the input stream to read the entire file into the byte array
		
		in.read(bytes);
		
		in.close();
		
		
		
		System.out.println("Bytes available to read: "+bytesAvailable);
		
		String myString=new String(bytes);
		
		System.out.println(myString);
		

	}

}
