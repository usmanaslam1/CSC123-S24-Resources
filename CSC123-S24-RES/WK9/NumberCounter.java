
public class NumberCounter extends Thread{
	String name;
	public NumberCounter(String name) {
		this.name=name;
	}
	
	public void run() {
		count();
	}

	public void count() {
		for (int i = 1; i <= 100; i++) {
			System.out.println(getName()+" : "+i);
			
			
		}
		
	}

}
