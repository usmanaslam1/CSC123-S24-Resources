import java.util.HashMap;
import java.util.Map;

public class CurrencyLoaderImpl implements ICurrencyLoader{

	@Override
	public Map<String,Double> loadCurrencies() {
		Map m=new HashMap<String,Double>();
		m.put("USD", 1.0);
		m.put("CAD", 0.75);
		m.put("EUR", 1.1);
		m.put("GBP", 1.25);
		
		return m;
	}

}
