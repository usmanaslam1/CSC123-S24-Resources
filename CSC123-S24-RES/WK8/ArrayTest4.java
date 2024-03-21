import java.util.Arrays;

public class ArrayTest4 {
	

	public static void main(String[] args) {
		//Java.util.Arrays class can be used to manipulate arrays
				
		int[][] numbers2= {{1,2,3,4,5},{1,2,3,4,5},{1,2,3,4,5},{1,2,3,4,5},{1,2,3,4,5}};
		int[][] numbersCopy= new int[5][5];
		
		Arrays.fill(numbersCopy, 100);
		
		//Arrays.arrayCopy(numbers2, numbersCopy);
		Arrays.sort(numbers2);
		
		

		
	}

}
