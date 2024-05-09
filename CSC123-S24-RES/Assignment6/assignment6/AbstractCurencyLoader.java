package assignment6;

import java.util.HashMap;
import java.util.Map;

public  class AbstractCurencyLoader {

	public Map<String, MyCurrency> loadCurrencies(){
		
		Map m=new HashMap<String, MyCurrency>();
		m.put("CAD",new MyCurrency("CAD", .75));
		return m;
	}
 	
}
