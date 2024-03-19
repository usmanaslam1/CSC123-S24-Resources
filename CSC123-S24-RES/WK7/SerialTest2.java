import java.io.File;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.ArrayList;

/**
 * This is a demonstration of how to read from a file and then deserialize an object
 *
 */
public class SerialTest2 {

	public static void main(String[] args) throws Exception{
		
		//create a file
		File shoppingList=new File("/Users/usman/shoppingList.ser");
		FileInputStream fileIn=new FileInputStream(shoppingList);
		ObjectInputStream in=new ObjectInputStream(fileIn);
		
		
		//Read object from the file
		Object o=in.readObject();
		
		//cast the object to its original type
		ArrayList<String> s=(ArrayList<String>)o;
		
		//Loop through the arraylist to see if all items have been restored. 
		for(String item:s) {
			System.out.println(item);
		}
		
		
	}

}
