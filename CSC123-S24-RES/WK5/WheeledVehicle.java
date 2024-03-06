
public class WheeledVehicle extends Vehicle{
	private int wheels;
	private  int hoursePower;
	private String type;
	
	public WheeledVehicle(String make, String model, String color, int horsePower, int wheels,String type) {
		super(make, model, color);
		this.hoursePower = horsePower;
		this.wheels = wheels;
		this.type=type;
	}
	
	public int getHoursePower() {
		return hoursePower;
	}
	
	public int getWheels() {
		return wheels;
	}

	public String getType() {
		return type;
	}
}
