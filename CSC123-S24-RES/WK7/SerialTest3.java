import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

/**
 * 
 * Demonstration of serializing and storing an object in a file. This time the object
 * is a custom made object with more complex data structure
 * and dependencies
 *
 *
 */
public class SerialTest3 {
	
	public static void main(String[] args) throws Exception{
		
		Owner o1 = new Owner("John", "Doe");
		
		ElectricCar c1 = new ElectricCar("Tesla", "Model S", "Red");
		ElectricCar c2 = new ElectricCar("Tesla", "Model 3", "Blue");
		
		o1.addCar(c1);
		o1.addCar(c2);
		
		System.out.println(c1.getOwner());
		System.out.println(c2.getOwner());
		
		o1.listCars();

		
		
		//create a file
		File owner=new File("/Users/usman/owner.ser");
		//Serializing the object
		
		
		//create file output stream
		FileOutputStream fileOut=new FileOutputStream(owner);		
		
		//create an object output stream
		ObjectOutputStream out=new ObjectOutputStream(fileOut);
		
		//write serializable object to it
		out.writeObject(o1);
		
		//flush and close
		out.flush();
		out.close();
		
		System.out.println("Object has been serialized");
	
		
	}

}
