
public class NullTest {

	public static void main(String[] args) {
		
		Human3 h = new Human3("James","Bond","Blue","Black");
		Human3 h2=h;
		h=null;
		String human4="hello human";
		
        System.out.println(h2.equals(human4));
        
        

	}

}
