package LabWork;

import java.util.Scanner;
import java.util.Arrays;

public class SortingAlfabet {

	void sorting(String s[])
	{
		/*
			a method that can accept an array of String objects and sort in alphabetical order.
			The elements in the left half should be completely in uppercase and
			the elements in the right half should be completely in lower case. Return the resulting array
		*/
		int n = s.length;
		Arrays.sort(s);
		if(n%2 == 0)
		{
			for(int i=0;i<n/2;i++)
			{
				s[i] = s[i].toUpperCase();
			}
			for(int i=n/2;i<n;i++)
			{
				s[i] = s[i].toLowerCase();
			}
		}
		else
		{
			for(int i=0;i<(n/2)+1;i++)
			{
				s[i] = s[i].toUpperCase();
			}
			for(int i=(n/2)+1;i<n;i++)
			{
				s[i] = s[i].toLowerCase();
			}
		}
		System.out.println(Arrays.toString(s));
	}

	public static void main(String ar[])
	{
		String str,strr[];
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter String --> ");
		str = sc.nextLine();
		strr = str.split("");
		SortingAlfabet ex1 = new SortingAlfabet();
//		for(String i : strr)
//			System.out.println(i);
		ex1.sorting(strr);
		sc.close();
	}
}
