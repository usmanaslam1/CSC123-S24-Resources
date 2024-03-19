import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.FileInputStream;

public class FileTest6 {

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
		
		int i;
		
		while((i=in.read())!=-1) {
            System.out.print((char)i);
        }
		
	    in.close();

	}

}
