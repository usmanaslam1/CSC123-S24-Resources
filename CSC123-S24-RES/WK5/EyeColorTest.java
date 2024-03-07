
public class EyeColorTest {

	public static void main(String[] args) {
		
		try {
			Human h=new Human("John","Doe",null,null);
		}
		catch (EyeColorMissingException e) {
			System.out.println(e.getMessage());
		}
		
		System.out.println("Program continues...");
	}

}
