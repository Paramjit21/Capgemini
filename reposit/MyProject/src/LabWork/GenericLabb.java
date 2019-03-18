package LabWork;

import java.util.HashMap;
import java.util.Map;
	//Count the number of occurrence of each character in a 
	//Character array 

import javax.print.attribute.HashAttributeSet;

public class GenericLabb {
	
	public static Map<Character,Integer> countCharacter(char ar[])
	{
		Map<Character, Integer> countMap = new HashMap<Character, Integer>();
		for(char c : ar)
		{
			if(countMap.containsKey(c))
			{
				countMap.put(c, countMap.get(c)+1);
			}
			else
				countMap.put(c,1);
		}
		return countMap;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char ar[] = {'P','A','r','a','m','m'};
		
		System.out.println(countCharacter(ar));

	}

}
