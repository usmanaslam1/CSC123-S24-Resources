import java.io.Serializable;
import java.util.Objects;

/**
 * This is the Car class. It has a make, model, color, and owner.
 */

public class Car implements Serializable{
	
	/**
	 * This represents make of the car. This is useless because it is a private field
	 */
    String make;
	String model;
	String color;
	Owner owner;
	
	/**
	 * This is the constructor for the Car class. It takes in make, model, and color of the car
	 * @param make of the car
	 * @param model	of the car
	 * @param color	of the car
	 */
	
	public Car(String make, String model, String color) {
		this.make = make;
		this.model = model;
		this.color = color;
	}

	
	/**
	 * This method sets owner of the car
	 * @param o This respresents owner of the car
	 */
	
	public void setOwner(Owner o) {	
		if(owner==null||!owner.equals(o)){
			owner = o;
		}
		o.addCar(this);
	}
	

	
	/**
	 * 
	 * @return  returns ownwer of the car
	 */
	public Owner getOwner() {
		return owner;
	}
	
	/**
	 * Returns make of the car
	 * @return make of the car
	 */
	public String getMake() {
		return make;
	}
	/**
	 * Returns model of the car
	 * @return model of the car
	 */
	public String getModel() {
		return model;
	}

	/**
	 * Returns color of the car
	 * @return color of the car
	 */
	public String getColor() {
		return color;
	}
	
	/**
	 * This method returns the make, model, and color of the car
	 * 
	 * @return make, model, and color of the car
	 */
	public String toString() {
		return "Make: " + make + ", Model: " + model + ", Color: " + color;
	}


	@Override
	public int hashCode() {
		return Objects.hash(color, make, model, owner);
	}


	
	
	

}
