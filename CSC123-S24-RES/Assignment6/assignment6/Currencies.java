package assignment6;
import java.util.HashMap;
import java.util.Map;

public class Currencies {
	
	Map<String,MyCurrency> currencies = new HashMap<String, MyCurrency>();
	
	public Currencies() {		
		AbstractCurencyLoader cl=new AbstractCurencyLoader();
		currencies=cl.loadCurrencies();
		
	}

	

	public MyCurrency getCurrency(String name) {
        return currencies.get(name);
    }
	
	public boolean existsCurrency(String name) {
		return currencies.containsKey(name);
	}
	
	
	
}