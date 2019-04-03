package com;

/**
 *
 * @author Param
 *
 */

import java.util.Scanner;

public class Exercise33 {
	void getsorted(int ar[],int n)
	{
		int t,rev=0,temp=0;
		for(int i=0;i<n;i++)
		{
			t=ar[i];
			while(t!=0)
			{
				rev = rev * 10;
		        rev = rev + t%10;
		        t = t/10;
			}
			ar[i]=rev;
			rev=0;
			t=0;
			
		}
		/*for(int i=0;i<n;i++)
		{
			System.out.println(ar[i]);
		}*/
		//System.out.println();
		for(int i=0;i<n-1;i++)
		{
			for(int j=i+1;j<n;j++)
			{
				if(ar[i]>ar[j])
				{
					temp=ar[i];
					ar[i]=ar[j];
					ar[j]=temp;
				}
			}
		}
		for(int i=0;i<n;i++)
		{
			System.out.println(ar[i]);
		}
	}
	public static void main(String[] args) {
		
		int n;
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		int ar[]=new int[n];
		for(int i=0;i<n;i++)
		{
			ar[i]=sc.nextInt();
		}
		Exercise33 ex3=new Exercise33();
		ex3.getsorted(ar, n);

	}

}
