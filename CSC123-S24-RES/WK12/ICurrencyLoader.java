import java.util.Map;

public interface ICurrencyLoader {
	public final String NAME="Currency Loader";
	
	public Map<String, Double> loadCurrencies();

}
