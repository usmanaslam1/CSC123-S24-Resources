import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.FileInputStream;
import java.io.OutputStream;
import java.io.FileOutputStream;

public class FileTest5 {
	//Copy files
	public static void main(String[] args) throws IOException {

		File source = new File("/Users/usman/test123/file.txt");
		File dest = new File("/Users/usman/test123/file2.txt");
	
		//Checks on the source file 
		if (!source.exists()) {
			System.out.println("File does not exist!");
			System.exit(0);
		}
		
		if (!source.isFile()) {
			System.out.println("Not a file!!");
			System.exit(0);
		}
		
		if (!source.canRead()) {
			System.out.println("Can't read file!!");
			System.exit(0);
		}

		//Checks on the destination file
		
		
		if (dest.exists()) {
			System.out.println("File aleady exists!");
			System.exit(0);
		}

		
		dest.createNewFile();
		
		
		if (!dest.canWrite()) {
			System.out.println("Can't write to file!!");
			System.exit(0);
		}
	
		//At this point both source and destination files exist and ready to be read/written to
	
		
		InputStream in=new FileInputStream(source);
		OutputStream out=new FileOutputStream(dest);
		
		int i; //will hold a byte
		
		while((i=in.read())!=-1) { //here i am reading one byte at a time until i receive -1, which means no more bytes
            out.write(i); //writing my bytes to output file
        }
		
	    in.close();
	    out.flush();
	    out.close();

	}

}
