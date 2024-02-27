//Imports
//Currently, nothing to import

// Class declaration

import java.util.ArrayList;

public class Owner { //public class, called Human

	//Instance fields
	private String firstName;
	private String lastName;
	private ArrayList<Car> cars;
	
	
	//Constructor
	
	public Owner(String fName, String lName) {
		firstName = fName;
		lastName = lName;
		cars=new ArrayList<Car>();
	}
	
    //Setter Methods	
	
	public void addCar(Car c) {
		cars.add(c);
		c.setOwner(this);
	}
	
	public void listCars() {
		for (Car c : cars) {
			System.out.println(c);
		}
	}
	
	public void setFirstName(String fName) {
		firstName = fName;
	}

	public void setLastName(String lName) {
		lastName = lName;
	}

	//Getter methods
	
	public String getFirstName() {
		return firstName;
	}
	
	public String getLastName() {
		return lastName;
	}

	
	public String toString() {
		return "First Name: " + firstName + ", Last Name: " + lastName;
	}
	
}
