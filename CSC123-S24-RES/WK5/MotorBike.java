
public class MotorBike extends WheeledVehicle{
	
	public MotorBike(String make, String model, String color,int horsePower, int wheels) {
		super(make, model, color,wheels, horsePower,"MotorBike");
		
	}
	
	@Override
	public String makeSound() {
		
		return "Vroom Vroom";
	}

	@Override	
	public String  toString() {
        return super.toString()+ " MotorBike [wheels=" + getWheels() + ", hoursePower=" + getHoursePower() + "]";
    }
	
	
	
	

}
