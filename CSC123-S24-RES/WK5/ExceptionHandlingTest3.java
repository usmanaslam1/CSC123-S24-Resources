
public class ExceptionHandlingTest3 {
	public static void main(String[] args) {
		
		int x=10;
		int y=0;
		int idx=2;
		int[] arrayOfNumbers={1,2,3};
		try {
			System.out.println(divide(x, y));
			System.out.println(arrayOfNumbers[idx]);
		}
		catch (ArithmeticException |ArrayIndexOutOfBoundsException e) {
			System.out.println(e.getMessage());
		}
		
	
		System.out.println("we are done with math");
	}

	private static int divide(int x, int y) {
        return x/y;
    }

}
