package assignment6;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public abstract class AbstractCurencyLoader {

	
	public static AbstractCurencyLoader getInstance(String type) {
		type=type.toUpperCase().strip();
		
		if(type.equals("FILE")) {
			return null;
			
		}
		else if(type.equals("STRING")) {
			return new StringHook();
		}
		else if (type.equals("NETWORK")){
			return null;
			
		}
		
		return null;
		
	}
	
	public Map<String, MyCurrency> loadCurrencies() throws Exception{
		Map m=new HashMap<String, MyCurrency>();
		BufferedReader br=new BufferedReader(new InputStreamReader(getStream()));
		
		String line=null;
		while((line=br.readLine())!=null) {
			String[] tokens=line.split(",");
			String currencyCode=tokens[0];
			double exchangeRate=Double.valueOf(tokens[2]);
			m.put(currencyCode,new MyCurrency(currencyCode, exchangeRate));
		}
		return m;
	}
	
	protected abstract InputStream getStream();
 	
}
