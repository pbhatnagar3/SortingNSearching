import java.util.ArrayList;
import java.util.HashMap;

/**
 * testing some of the implemented classes
 * @author pbhatnagar
 * If you have any questions or comments, please feel free to contact
 * me at pbhatnagar3@gatech.edu
 *
 * MAY THE FORCE OF COMPILER BE WITH YOU. :D
 */
public class Testing {
	public static void main(String[] args) {
	Integer a = 12;
	Integer b = a;
	a = a + 4;
	System.out.println(a + " " + b);
	HashMap<String, Integer> map = new HashMap<String, Integer>();
	HashMap<String, Integer> map1 = map;
	map.put("this is my shizzle", 10);
	System.out.println(map.size() + " " + map1.size());
	ArrayList<String> yomama = new ArrayList<String>(){
		@Override
		public String toString(){
			String output = "";
			//add everything to this output string
			return null;
		}
		
	};
	}
}
