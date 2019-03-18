package LabWork;

import java.util.HashMap;
import java.util.Map;

public class SquareMap {
	public static Map<Integer, Integer>  squareMa(int ar[])
	{
		Map<Integer, Integer> rsquare = new HashMap<Integer, Integer>();
		for(int c : ar)
		{
			if(rsquare.containsKey(c))
			{
				
			}
			else
				rsquare.put(c,c*c);
		}
		return rsquare;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int ar[] = {2,5,3,6,9};
		System.out.println(squareMa(ar));

	}

}
