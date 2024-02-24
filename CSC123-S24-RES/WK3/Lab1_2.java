public class Lab1_2 {
    public static boolean isPrime(int num) {
    	
    	int counter=0;
    	
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
        	counter++;
            if (num % i == 0) {
                return false;
            }
        }
        
        System.out.println("Counter: "+counter);
        return true;
    }

    public static void main(String[] args) {
        int number = 1000000007;
        System.out.println(isPrime(number)); // Output: true
    }
}