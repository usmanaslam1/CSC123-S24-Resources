
public class BubbleSort {

	public static void main(String[] args) {	
		
		int[] randomNumbers = {0, 9, 2, 9, 3,2,7,8,1,0, 9, 2, 9, 3,2,7,8,1,0, 9, 2, 9, 3,2,7,8,1,0, 9, 2, 9, 3,2,7,8,1,0, 9, 2, 9, 3,2,7,8,1,0, 9, 2, 9, 3,2,7,8,1,0, 9, 2, 9, 3,2,7,8,1,0, 9, 2, 9, 3,2,7,8,1};  

		System.out.println("Before Sort: "+randomNumbers.length);
		sort(randomNumbers);
	}

	public static void sort(int[] array) {
		boolean swapped = false;
		int loopCounter=0;

		do {
			swapped=false;
			for (int x = 0; x < array.length - 1; x++) {
				if (array[x] > array[x + 1]) {
					swap(array, x, x + 1);
					swapped=true;
				}
				loopCounter++;
			}
		} while (swapped);
		
		System.out.println("Loop Counter: " + loopCounter);
	}

	private static void swap(int[] array, int a, int b) {
		int tmp = array[a];
		array[a] = array[b];
		array[b] = tmp;
	}

}
