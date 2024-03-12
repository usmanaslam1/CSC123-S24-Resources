import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DFTest1 {
	
	private static String INPUT_PATTERN="MM/dd/yyyy";
	private static String OUTPUT_PATTERN="MMM, dd, yyyy - G";
	
	public static void main(String[] args) {
		
		
		String date="05/12/2024";
		
		try {
			SimpleDateFormat sdf = new SimpleDateFormat(INPUT_PATTERN);
			SimpleDateFormat sdf2 = new SimpleDateFormat(OUTPUT_PATTERN);
			
			Date d = sdf.parse(date);
			
			System.out.println(sdf2.format(d));
			
		} catch (ParseException e) {
			System.out.println("Invalid date format");
		}

		
		
		

	}

}
