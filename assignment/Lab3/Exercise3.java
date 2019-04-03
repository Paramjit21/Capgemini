package com;

/**
 *
 * @author Param
 *
 */

import java.util.Scanner;

public class Exercise3 {

	void getSecondSmallest(int ar[],int n)
	{
		int i,j,temp;
		for(i=0;i<n-1;i++)
		{
			for(j=i;j<n;j++)
			{
				if(ar[i]>ar[j])
				{
					temp=ar[i];
					ar[i]=ar[j];
					ar[j]=temp;
				}
			}
		}
		for(i=0;i<n;i++)
		{
			System.out.println(ar[i+1]);
			break;
		}
	}
	@SuppressWarnings("resource")
	public static void main(String ar[])
	{
		int n;
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		Exercise3 ex=new Exercise3();
		ex.getSecondSmallest(arr,n);
	}
}
