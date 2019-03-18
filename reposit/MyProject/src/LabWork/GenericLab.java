package LabWork;

	//a method which accepts a hash map 
	//and return the values of the map in sorted order as a List.
import java.util.*;

public class GenericLab {
	public static List<String> SortedM(Map<Integer, String> m)
	{
		TreeMap<Integer, String> sor = new TreeMap<Integer, String>();
		List<String> sorl = new ArrayList<String>();
		sor.putAll(m);
		for(Map.Entry<Integer, String> entr : sor.entrySet())
		{
			System.out.println("Value = "+entr.getValue());
			sorl.add(entr.getValue());
			
		}
		return sorl;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Integer, String> m =  new LinkedHashMap<Integer, String>();
		m.put(21,"Amit");
		m.put(52,"Vishal");
		m.put(22,"Modi");
		m.put(12,"Sodi");
		SortedM(m);
		System.out.println(SortedM(m));
		

	}

}
