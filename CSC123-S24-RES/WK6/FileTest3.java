import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.FileInputStream;

public class FileTest3 {

	public static void main(String[] args) throws IOException {

		File f = new File("/Users/usman/test123/file.txt");
		MyFile mf=new MyFile("/Users/usman/test123/file.txt");
		
		System.out.println(mf);
	

	}

}
