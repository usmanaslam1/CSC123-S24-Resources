

public class VehicleTest {
	
	public static void main(String[] args) {
		Vehicle vehicle = new Vehicle("Toyota", "Corolla", "Red");
		MotorBike motorbike = new MotorBike("Yamaha", "R1", "Blue", 100,2);			    
	    Truck truck= new Truck("Ford", "F150", "White", 200,4);
	    
	    
	    System.out.println(vehicle.makeSound());
	    System.out.println(truck.makeSound());
	    System.out.println(motorbike.makeSound());
	    
	    
	    System.out.println(vehicle.getClass().getName());
	}

}
