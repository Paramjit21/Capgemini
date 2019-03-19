package LabWork;

import java.util.Scanner;

public class SecondSmallestValue {

	void getSecondSmallest(int ar[],int n)
	{
		/*
		 	accepts an array of integer elements and
			return the second smallest element in the array
		*/
		for(int i=0;i < n-1;i++)
		{
			for(int j=i;j < n;j++)
			{
				if(ar[i] > ar[j])
				{
					ar[i] = ar[i] + ar[j];
					ar[j] = ar[i] - ar[j];
					ar[i] = ar[i] - ar[j];
				}
			}
		}
		if(n == 1)
		{
			System.out.print("Largest and Second largest in array is --> ");
			System.out.println(ar[0]);		
		}
		else
		{
			System.out.print("Second largest in array is --> ");
			System.out.println(ar[1]);
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
		SecondSmallestValue ex=new SecondSmallestValue();
		ex.getSecondSmallest(arr,n);
	}
}
