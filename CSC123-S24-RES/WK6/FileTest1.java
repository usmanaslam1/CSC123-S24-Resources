import java.io.File;
public class FileTest1 {

	public static void main(String[] args) {
	
	 File f=new File("/Users/usman/test123");
	 
	 System.out.println(f.exists());
	 System.out.println(f.isDirectory());
	 System.out.println(f.isFile());
	 
	 System.out.println(f.canRead());
	 try {
		 f.createNewFile();
	 }
		catch (Exception e) {
			System.out.println("not possibl to create file");
		}
	
	 System.out.println(f.getParent());
	 
	 File[] files=f.listFiles();
	 	System.out.println("\n\n\nFiles in the directory are:");
		for (File file : files) {
			System.err.println(file.getName());
		}
	 
	 //System.out.println(f.delete());

	}

}
