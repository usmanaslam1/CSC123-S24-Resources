//Imports
//Currently, nothing to import

// Class declaration

import java.util.ArrayList;
import java.util.Objects;

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
		if(!cars.contains(c)) {
			cars.add(c);
        }
		
		if (c.getOwner()== null ||!c.getOwner().equals(this)) {
			c.setOwner(this);
		}

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

	@Override
	public int hashCode() {
		return Objects.hash(cars, firstName, lastName);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Owner other = (Owner) obj;
		return Objects.equals(cars, other.cars) && Objects.equals(firstName, other.firstName)
				&& Objects.equals(lastName, other.lastName);
	}
	
}
