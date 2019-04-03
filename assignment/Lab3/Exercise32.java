package com;

/**
 *
 * @author Param
 *
 */

import java.util.Scanner;
import java.util.Arrays;

public class Exercise32 {
	
	void sorting(String s[],int n)
	{
	/*	for(int i = 0; i<n-1; i++) {
	         for (int j = i+1; j<s.length; j++) {
	            if(s[i].compareTo(s[j])>0) {
	               String temp = s[i];
	               s[i] = s[j];
	               s[j] = temp;
	            }
	         }
	      }*/
		Arrays.sort(s);
		if(n%2==0)
		{
			//String ss[]=new String[n/2];
			for(int i=0;i<n/2;i++)
			{
				s[i]=s[i].toUpperCase();
			}
			for(int i=n/2;i<n;i++)
			{
				s[i]=s[i].toLowerCase();
			}
		}
		else
		{
			for(int i=0;i<(n/2)+1;i++)
			{
				s[i]=s[i].toUpperCase();
			}
			for(int i=(n/2)+1;i<n;i++)
			{
				s[i]=s[i].toLowerCase();
			}
		}
		System.out.println(Arrays.toString(s));
	}

	public static void main(String ar[])
	{
		int n;
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		String s[]=new String[n];
		for(int i=0;i<n;i++)
		{
			s[i]=sc.next();
		}
		Exercise32 ex1=new Exercise32();
		ex1.sorting(s, n);
	}
}
