//Imports
//Currently, nothing to import

// Class declaration
public class Human { //public class, called Human

	//Instance fields
	private String firstName;
	private String lastName;
	private String eyeColor;
	private String hairColor;
	private int heightInFeet;
	private int heightInInches;
	
	//Constructor
	
	public Human(String fName, String lName, String hColor, String eColor) {
		firstName=fName;
		lastName=lName;
		hairColor=hColor;
		eyeColor=eColor;
		
	}
	
	//Setter Methods
	public void setFirstName(String fName) {
		firstName=fName;
	}
	public void setLastName(String lName) {
		lastName=lName;
	}
	public void setEyeColor(String eColor) {
		eyeColor=eColor;
	}
	public void setHairColor(String hColor) {
		hairColor=hColor;
	}
	public void setHeightInFeet(int hf) {
		heightInFeet=hf;
	}
	public void setHeightInInches(int hi) {
		heightInInches=hi;
	}
	
	
	//Getter methods	
	
	public String getFirstName() {
		return firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public String getEyeColor() {
		return eyeColor;
	}
	public String getHairColor() {
		return hairColor;
	}
	public int getHeightInFeet() {
		return heightInFeet;
	}
	public int getHeightInInches() {
		return heightInInches;
	}
	public String getFullName() {
		
		return getFirstName()+" "+getLastName();
	}
	
	
	
	
	
	
	
}
