import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;


/**
 * 
 * This is a demonstration of serializing and storing an object in a file
 */
public class SerialTest {
	
	public static void main(String[] args) throws Exception{
		
		
		
		//creatre a serializable object
		ArrayList<String> s=new ArrayList<String>();
		s.add("Tomatoes");
		s.add("Potatoes");
		s.add("Carrots");
		s.add("Cabbage");
		s.add("Peas");
		
		
		//create a file
		File shoppingList=new File("/Users/usman/shoppingList.ser");
		//Serializing the object
		
		
		//create file output stream
		FileOutputStream fileOut=new FileOutputStream(shoppingList);		
		
		//create an object output stream
		ObjectOutputStream out=new ObjectOutputStream(fileOut);
		
		//write serializable object to it
		out.writeObject(s);
		
		//flush and close
		out.flush();
		out.close();
		
		System.out.println("Object has been serialized");
	
		
	}

}
