import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;

public class MyNewScanner {
	
	InputStream in;
	
	public MyNewScanner(InputStream in) {
		this.in = in;
	}
	public MyNewScanner(File file) throws Exception {
		if (!file.exists()) {
			throw new Exception("FIle does not exist");
		}
		
		InputStream myIn = new FileInputStream(file);
		this.in = myIn;
	}
	
	public MyNewScanner(String file) throws Exception {
		if (!file.exists()) {
			throw new Exception("FIle does not exist");
		}
		
		InputStream myIn = new FileInputStream(file);
		this.in = myIn;
	}

		

}
