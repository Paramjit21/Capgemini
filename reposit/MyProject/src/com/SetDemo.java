package com;

import java.util.HashSet;
import java.util.Set;

class Person implements Comparable<Person>
{
	String name;
	public int hashcode()
	{
		return name.length();
	}
	public boolean equals(Object obj)
	{
		if(obj instanceof Person && this.name == ((Person)obj).name)
			return true;
		else
			return false;
	}
	@Override
	public int compareTo(Person obj) {
		// TODO Auto-generated method stub
		return 0;
	}
}


public class SetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stubt
		Set<String> str = new HashSet<String>();
		str.add("A");
		str.add("B");
		str.add("C");
		str.add("D");
		str.add("E");
		str.add("F");
		System.out.println(str);
		


}

}