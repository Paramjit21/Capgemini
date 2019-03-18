package com;

import java.util.Scanner;

public class SortingInteger {
	void getsorted(int ar[],int n)
	{
		/*
		an integer array, reverse the numbers in the array and
		returns the resulting array in sorted order
		*/
		int t,rev = 0,temp = 0;
		for(int i=0;i<n;i++)
		{
			t=ar[i];
			while(t!=0)
			{
				rev = rev * 10;
		    rev = rev + t%10;
		    t = t/10;
			}
			ar[i] = rev;
			rev = 0;
			t = 0;

		}
		for(int i=0;i<n-1;i++)
		{
			for(int j=i+1;j<n;j++)
			{
				if(ar[i] > ar[j])
				{
					ar[i] = ar[i] + ar[j];
					ar[j] = ar[i] - ar[j];
					ar[i] = ar[i] - ar[j];
				}
			}
		}
		for(int i=0;i<n;i++)
		{
			System.out.print(ar[i] + " ");
		}
	}
	public static void main(String[] args) {

		int n;
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		int ar[] = new int[n];
		for(int i=0;i<n;i++)
		{
			ar[i] = sc.nextInt();
		}
		SortingInteger ex = new SortingInteger();
		ex.getsorted(ar, n);

	}

}
