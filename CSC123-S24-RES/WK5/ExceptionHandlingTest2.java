
public class ExceptionHandlingTest2 {
	public static void main(String[] args) {
		
		int x=10;
		int y=2;
		int idx=5;
		int[] arrayOfNumbers={1,2,3};
		try {
			System.out.println(divide(x, y));
			System.out.println(arrayOfNumbers[idx]);
		}
		catch (ArithmeticException myException) {
			System.out.println(myException.getMessage());
			myException.printStackTrace();
		}
		catch (ArrayIndexOutOfBoundsException myException) {
			System.out.println("Array index out of bounds");
		}
	
		System.out.println("we are done with math");
	}

	private static int divide(int x, int y) {
        return x/y;
    }

}
