import java.io.File;
import java.io.FileInputStream;

public class MyScanner {
	
	FileInputStream fis;
	
	public MyScanner(File f) throws Exception {
		fis=new FileInputStream(f);
		
    }
	
	public String nextLine() throws Exception {
		
		int i;
		String s="";
		
		while((i=fis.read())!=-1) {
			if(i=='\n') {
				return s;
			}
			s+=(char)i;
        }
		
		return null;
		
	}
	

}
