import java.util.Map;
import java.util.HashMap;

/**
 * @author Param
 *
 */

public class Exercise73 {

	public Map<Integer, Integer> getSquares(int[] a){
		Map<Integer, Integer> m=new HashMap<Integer, Integer>();
		for(int i:a) {
			m.put(i, i*i);
		}
		return m;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {2,4,5,6,7,10,34,44};
		Exercise73 e=new Exercise73();
		System.out.println(e.getSquares(a));
	}

}
