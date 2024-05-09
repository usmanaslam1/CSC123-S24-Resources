
public class UniqueCounterTest {

		public static void main(String[] args) {
			
			UniqueCounter counter1 = UniqueCounter.getInstance();
			
			System.out.println(counter1.next()); // 1
			System.out.println(counter1.next()); // 2
			System.out.println(counter1.next()); // 3
				
			 counter1= UniqueCounter.getInstance();
				
				System.out.println(counter1.next()); // 1
				System.out.println(counter1.next()); // 2
				System.out.println(counter1.next()); 
		}
}
