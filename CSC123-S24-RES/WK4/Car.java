
public class Car {
	
    String make;
	String model;
	String color;
	Owner owner;
	
	public Car(String make, String model, String color) {
		this.make = make;
		this.model = model;
		this.color = color;
	}

	
	public void setOwner(Owner o) {		
		owner = o;
	}
	
	public Owner getOwner() {
		return owner;
	}
	
	public String getMake() {
		return make;
	}
	
	public String getModel() {
		return model;
	}

	public String getColor() {
		return color;
	}
	
	public String toString() {
		return "Make: " + make + ", Model: " + model + ", Color: " + color;
	}

}
