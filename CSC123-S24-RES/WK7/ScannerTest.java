import java.io.File;
import java.util.Scanner;

public class ScannerTest {

	public static void main(String[] args) throws Exception{
		
		File f=new File("/Users/usman/test123/file.txt");
		
		MyNewScanner sc=new MyNewScanner(f);
		
		System.out.println(sc.nextLine());
		System.out.println(sc.nextLine());
		System.out.println(sc.nextLine());
		System.out.println(sc.nextLine());
	}

}
