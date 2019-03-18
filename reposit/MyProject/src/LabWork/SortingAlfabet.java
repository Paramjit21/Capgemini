package com;

import java.util.Scanner;
import java.util.Arrays;

public class SortingAlfabet {

	void sorting(String s[],int n)
	{
		/*
			a method that can accept an array of String objects and sort in alphabetical order.
			The elements in the left half should be completely in uppercase and
			the elements in the right half should be completely in lower case. Return the resulting array
		*/
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
		int n;
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		String s[] = new String[n];
		for(int i=0;i<n;i++)
		{
			s[i] = sc.next();
		}
		SortingAlfabet ex1 = new SortingAlfabet();
		ex1.sorting(s, n);
	}
}
