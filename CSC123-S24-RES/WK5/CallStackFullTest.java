
public class CallStackFullTest {

	public static void main(String[] args) {
		printsomething();

	}
	
	private static void printsomething() {
		System.out.println("Hello");
		printsomething();
	}

}
