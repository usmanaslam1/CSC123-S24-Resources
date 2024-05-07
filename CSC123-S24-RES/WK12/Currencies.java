import java.util.HashMap;
import java.util.Map;

public class Currencies {
	
	Map<String,MyCurrency> currencies = new HashMap<String, MyCurrency>();
	
	public Currencies(ICurrencyLoader loader) {
		
		Map<String,Double> currencyMap=loader.loadCurrencies();
		
		for (String key : currencyMap.keySet()) {
			
			MyCurrency c = new MyCurrency(key, currencyMap.get(key));
			this.currencies.put(key.toString(), c);
		}
	}

	public Currencies() {
		
		currencies.put("USD",new MyCurrency("USD", 1.0));
		currencies.put("CAD", new MyCurrency("USD", .75));
	}

	public MyCurrency getCurrency(String name) {
        return currencies.get(name);
    }
	
	public boolean existsCurrency(String name) {
		return currencies.containsKey(name);
	}
	
	
	
}
