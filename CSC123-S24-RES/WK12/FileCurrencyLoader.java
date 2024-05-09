import java.io.File;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class FileCurrencyLoader implements ICurrencyLoader {

	@Override
	public Map<String, Double> loadCurrencies() {
		// this is what i need to return
		Map m = new HashMap<String, Double>();

		File file = new File("/Users/usman/currencies.csv");
		Scanner scanner = null;
		try {
			// get ready to read file
			scanner=new Scanner(file);
			String line = null;
			
			
			
			while ((line = scanner.nextLine()) != null) {
				String[] lineSegments = line.split(",");
				m.put(lineSegments[0], Double.parseDouble(lineSegments[2]));
			}
			
		} catch (Exception e) {
		}
		finally {
			if (scanner != null) {
				scanner.close();
			}
		}
		
		return m;

	}

}
