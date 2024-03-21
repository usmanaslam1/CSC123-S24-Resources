
public class ArrayTest {
	

	public static void main(String[] args) {
	
		// Single dimensional array part 1
		
		int[] numbers = new int[5];
		
		//Single dimensional array part 2
		
		int[] numbers2= {1,2,3,4,5};
		
		boolean[] bools = new boolean[5];
		
		
		//For loop to print out the array
		
		for (int x = 0; x < numbers2.length; x++) {
			System.out.println(numbers2[x]);
		}
		
		
		for(int item:numbers2) {
			System.out.println(item);
        }
		
		
		

		
	}

}
