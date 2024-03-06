
public class Truck extends WheeledVehicle{
	

	public Truck(String make, String model, String color, int horsePower, int wheels) {
		super(make, model, color,horsePower, wheels,"Truck");
	}


	public String makeSound() {

		return "Honk Honk";
	}
	
	public String toString() {
		return super.toString() + " Car [wheels=" + getWheels() + ", hoursePower=" + getHoursePower() + "]";
	}

}
