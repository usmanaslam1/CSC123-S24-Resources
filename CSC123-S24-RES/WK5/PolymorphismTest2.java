
public class PolymorphismTest2 {

	public static void main(String[] args) {
		
		Vehicle[] myVehicles = new Vehicle[2];
		
		myVehicles[0] = new Truck("Ford", "F150", "White", 200,4);
		myVehicles[1] = new MotorBike("Yamaha", "R1", "Blue", 100,2);
	}

}
