package assignment6;

import java.io.ByteArrayInputStream;
import java.io.InputStream;

public class StringHook extends AbstractCurencyLoader{

	@Override
	protected InputStream getStream() {
		String line="CAD,Canadian Dollar,0.60\n"
				+ "EUR,Canadian Dollar,1.2\n";
		ByteArrayInputStream bi=new ByteArrayInputStream(line.getBytes());
		return bi;
	}
	

}
