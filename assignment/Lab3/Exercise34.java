package com;

/**
 *
 * @author Param
 *
 */

import java.util.Scanner;

public class Exercise34 {
	int count=0;
	void count(String arr[],int n)
	{
		for(int i=0;i<n;i++)
		{
			for(int j=i+1;j<=n;j++)
			{
				if(arr[i].equals(arr[j]))
				{
					count=count++;
				}
			}
			System.out.println("Occurence of"+arr[i]+"is"+count);
			count=0;
		}
	}
	public static void main(String ar[])
	{
		int n;
		Scanner sc= new Scanner(System.in);
		n=sc.nextInt();
		String c[]=new String[n];
		for(int i=0;i<n;i++)
		{
			c[i]=sc.next();
		}
		Exercise34 ex4=new Exercise34();
		ex4.count(ar,n);
		
	}
}
