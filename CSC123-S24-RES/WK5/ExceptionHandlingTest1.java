
public class ExceptionHandlingTest1 {
	public static void main(String[] args) {
		
		int x=10;
		int y=0;
		try {
			System.out.println(x/y);
		}
		catch (ArithmeticException myException) {
			System.out.println(myException.getMessage());
			myException.printStackTrace();
		}
	
		System.out.println("we are done with math");
	}

}
