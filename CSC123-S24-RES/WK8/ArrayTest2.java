
public class ArrayTest2 {
	

	public static void main(String[] args) {
	
		// Single dimensional array part 1
		
		int[][][] numbers = new int[5][5][5];
		
		//Single dimensional array part 2
		
		int[][] numbers2= {{1,2,3,4,5},{1,2,3,4,5},{1,2,3,4,5},{1,2,3,4,5},{1,2,3,4,5},{1,2,3,4,5}};
		
		
		for (int i = 0; i < numbers2.length; i++) {
			for (int j = 0; j < numbers2[i].length; j++) {
				System.out.print(numbers2[i][j]+" ");
			}
			System.out.println();
		}
	
		
		

		
	}

}
