
public class PolymorphismTest {

	public static void main(String[] args) {
		
		Object[] myCollection = new Object[6];
		
		myCollection[0] = new Truck("Ford", "F150", "White", 200,4);
		myCollection[1] = new MotorBike("Yamaha", "R1", "Blue", 100,2);
		myCollection[2] = 39;
		myCollection[3] = "Hello";
		myCollection[4] = new java.util.Scanner(System.in);
		myCollection[5] = false;
		
		for (Object o : myCollection) {
			System.out.println(o.getClass().getName());
		}
		
		System.out.println(myCollection[0] instanceof Truck);
	}

}
