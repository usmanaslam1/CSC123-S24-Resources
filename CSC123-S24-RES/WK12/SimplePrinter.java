import java.util.Map;

public class SimplePrinter implements IPrinter {

	@Override
	public void print(Map<String, MyCurrency> m) {
		
		System.out.println("I am a Simple Printer!!!");
		for (String key : m.keySet()) {
			MyCurrency c = m.get(key);
			System.out.println(c.getName() + " " + c.getRate());
		}
		
	}

}
