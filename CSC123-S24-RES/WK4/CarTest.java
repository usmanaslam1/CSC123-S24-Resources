
public class CarTest {
	public static void main(String[] args) {

		Owner o1 = new Owner("John", "Doe");
	
		ElectricCar c1 = new ElectricCar("Tesla", "Model S", "Red");
		ElectricCar c2 = new ElectricCar("Tesla", "Model 3", "Blue");
		
		o1.addCar(c1);
		o1.addCar(c2);
		
		System.out.println(c1.getOwner());
		System.out.println(c2.getOwner());
		
		o1.listCars();
		
				
		
		
	}
}
