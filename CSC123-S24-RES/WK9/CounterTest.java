
public class CounterTest {
	
	public static void main(String[] args) {
		 Thread t1=new NumberCounter("Counter1");
		 t1.setPriority(Thread.MAX_PRIORITY);
		 t1.start();
		 
		 System.out.println(t1.getName());
		 
		 new NumberCounter("Counter2").start();
		 new NumberCounter("Counter3").start();
		 new NumberCounter("Counter4").start();
		 new NumberCounter("Counter5").start();
	}

}
