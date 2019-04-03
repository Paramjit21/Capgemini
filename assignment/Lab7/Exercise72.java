import java.util.HashMap;
import java.util.Map;

/**
 * @author Param
 *
 */

public class Exercise72 {

	public Map<Character, Integer> countCharecter(char[] c){
		
		Map<Character, Integer> m=new HashMap<Character, Integer>();
		for(int i=0;i<c.length;i++) {
			if(m.containsKey(c[i])) {
				int a=m.get(c[i]);
				m.put(c[i], a+1);
			}
			else {
				m.put(c[i], 1);
			}
		}
		return m;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[] c= {'a','d','f','g','d','f','a','d','f'};
		Exercise72 e=new Exercise72();
		Map<Character, Integer> m=e.countCharecter(c);
		System.out.println(m);

	}

}
