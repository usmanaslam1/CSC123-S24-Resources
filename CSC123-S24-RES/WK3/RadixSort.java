import java.util.Arrays;

public class RadixSort {

	public static void main(String[] args) {
		
		int masterLoopCounter=0;
		
		//Starting array
		int[] arr = {0, 9, 2, 9, 3,2,7,8,1,0, 9, 2, 9, 3,2,7,8,1,0, 9, 2, 9, 3,2,7,8,1,0, 9, 2, 9, 3,2,7,8,1,0, 9, 2, 9, 3,2,7,8,1,0, 9, 2, 9, 3,2,7,8,1,0, 9, 2, 9, 3,2,7,8,1,0, 9, 2, 9, 3,2,7,8,1};  
	    int n = arr.length;
	    
	    //this array will store the output
	    int[] output = new int[n];
	    
	    //this array will be used keep count
	    int[] count = new int[10];
	    Arrays.fill(count, 0);	  
	    

        // Store count of occurrences in count[]
        for (int i = 0; i < n; i++) {
            count[arr[i]]++;
            masterLoopCounter++;
        }
        
        //Work out where each number should be in the arra
        
        for (int i = 1; i < 10; i++) {
        	masterLoopCounter++;
            count[i] += count[i - 1];
        }
        
        // Build the output array
        for (int i = n - 1; i >= 0; i--) {
            output[count[arr[i]] - 1] = arr[i];
            count[arr[i]]--;
            masterLoopCounter++;
        }


        System.out.println(arr.length);
        System.out.println("Master Loop Counter: " + masterLoopCounter);
        
	}

}
