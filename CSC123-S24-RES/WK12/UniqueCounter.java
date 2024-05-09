
public class UniqueCounter {
	private int currentValue=1;
	private static UniqueCounter self=new UniqueCounter();
	
	
	public static UniqueCounter getInstance() {
		return self;
	}
	
	private UniqueCounter() {
	}
	
	public int next() {
		return currentValue++;
	}

}
