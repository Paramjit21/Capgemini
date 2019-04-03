import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.TreeSet;

/**
 * @author Param
 *
 */

public class Exercise71 {

public List<String> getValues(HashMap<Integer, String> m) {
		
		TreeSet<String> t=new TreeSet<String>(m.values());

		List<String> l=new ArrayList<String>(t);
		return l;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer, String> m=new HashMap<Integer, String>();
		m.put(1, "Amit");
		m.put(2, "Sahil");
		m.put(5, "Anand");
		Exercise71 e71=new Exercise71();
		System.out.println(e71.getValues(m));
	}

}
