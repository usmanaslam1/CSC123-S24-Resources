public class ExceptionTest4 {

	public static void main(String[] args){
		
		try {
			Human h = new Human(null, null, null, "something");
			System.out.println(10/0);

		} 
		catch (ArithmeticException e) {
			System.out.println(e.getMessage());
		} catch (EyeColorMissingException e) {
			System.out.println(e.getMessage());
		}

		finally {
			System.out.println("finally block");
		}

	}

}
