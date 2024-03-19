import java.io.File;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.ArrayList;

/**
 * This is a demonstration of how to read from a file and then deserialize an
 * object
 *
 */
public class SerialTest4 {

	public static void main(String[] args) throws Exception{
		
		//create a file
		File owner=new File("/Users/usman/owner.ser");
		FileInputStream fileIn=new FileInputStream(owner);
		ObjectInputStream in=new ObjectInputStream(fileIn);
		
		Object o=in.readObject();
		
		System.out.println(o.getClass().getName());
		
		Owner owner1=(Owner)o;
		
		owner1.listCars();
		
	}

}
