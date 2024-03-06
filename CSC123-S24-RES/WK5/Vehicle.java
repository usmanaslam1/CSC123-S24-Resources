
public  class Vehicle{
	
	private String make;
	private String model;
	private String color;
	
	public Vehicle(String make, String model, String color) {
		this.make = make;
		this.model = model;
		this.color = color;
	}
	
	public String getMake() {
		return make;
	}
	
	public  String makeSound() {
		return "Some Generic Sound";
	}
	

	public String getModel() {
		return model;
	}

	public String getColor() {
		return color;
	}

	@Override
	public String toString() {
		return "Generic Vehicle [make=" + make + ", model=" + model + ", color=" + color + "]";
	}
	

	
	
}
