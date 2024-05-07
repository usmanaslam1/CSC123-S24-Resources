public class MyCurrency {
	
	private String name;
	private double rate;

	public MyCurrency(String name, double rate) {
		this.name = name;
		this.rate = rate;
	}

	public String getName() {
		return name;
	}

	public double getRate() {
		return rate;
	}

	public double convertToUSD(double amount) {
		return amount * rate;
	}

	public double convertFromUSD(double amount) {
		return amount / rate;
	}

	public String toString() {
		return name + " (" + rate + ")";
	}

}
