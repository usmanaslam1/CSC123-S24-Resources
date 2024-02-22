//Imports
//Currently, nothing to import

// Class declaration
public class Human2 { //public class, called Human

	//Instance fields
	private String firstName;
	private String lastName;
	private String eyeColor;
	private String hairColor;
	private int heightInFeet;
	private int heightInInches;
	
	//Constructor
	
	public Human2(String firstName, String lastName, String hairColor, String eyeColor) {
		this.firstName=firstName;
		this.lastName=lastName;
		this.hairColor=hairColor;
		this.eyeColor=eyeColor;
		
	}
	
	public Human2(Human2 h) {
		firstName = h.getFirstName();
		lastName = h.getLastName();
		hairColor = h.getHairColor();
		eyeColor = h.getEyeColor();
		heightInFeet = h.getHeightInFeet();
		heightInInches = h.getHeightInInches();
	}
	
	//Setter Methods
	public void setFirstName(String fName) {
		String firstName="My Name";
		System.out.println(this.firstName);
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

	@Override
	public String toString() {
		return "Human [firstName=" + firstName + ", lastName=" + lastName + ", eyeColor=" + eyeColor + ", hairColor="
				+ hairColor + ", heightInFeet=" + heightInFeet + ", heightInInches=" + heightInInches + "]";
	}
	
	
	public boolean equals(Human h) {
			return getFirstName().equals(h.getFirstName()) && getLastName().equals(h.getLastName()) 
					&& eyeColor.equals(h.getEyeColor()) && hairColor.equals(h.getHairColor())
					&& heightInFeet==h.getHeightInFeet() && heightInInches==h.getHeightInInches();
	}
	
	
	//public String toString() {
	//	return getFirstName()+":" +  getLastName() + ":" + getEyeColor()+":"+ getHairColor();
	//}
	
	
	
	
	
	
}
