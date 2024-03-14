import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class MyFile {
	
	File f=null;
	/**
	 * Constructor
	 * @param fileName
	 * @throws IOException
	 */
	public MyFile(String fileName) throws IOException {
		
		File f=new File(fileName);
		
		if (!f.exists()) {
			throw new IOException("File does not exist!");	
		}
		
		if (!f.isFile()) {
			throw new IOException("Not a file!!");
		}
		
		if (!f.canRead()) {
			throw new IOException("Can't read file!!");
		}
		
	    this.f=f;
		
	}
	
	/**
	 * toString
	 */
	
	public String toString() {
	
		try {
			InputStream in=new FileInputStream(f);
			
			int i;
			
			while((i=in.read())!=-1) {
				Thread.sleep(500);
	            System.out.print((char)i);
	        }
			
		    in.close();
		}
		catch (Exception e) {
			System.out.println(e);
		}
	
		return "";
		
	}
	

}
