import java.util.Arrays;

public class ArrayTest3 {
	

	public static void main(String[] args) {
		//Java.util.Arrays class can be used to manipulate arrays
				
		Object[] objArray = new Object[5];
		objArray[0] = "String";
		objArray[1] = 1;
	    objArray[2] = 2.0;
	    objArray[3] = 'c';
	    objArray[4] = true;
	    
	    	
		System.out.println(Arrays.toString(objArray));

		
	}

}
