
public class MethodOverloadingTest  {

	public static void main(String[] args) {
		
		
		System.out.println(add("Hello","World"));
		System.out.println(add(1,2));

	}
	
	private static int add(int a,int b) {
        return a+b;
    }
	
	private static String add(String a, String b) {
		return a + b;
	}

}
