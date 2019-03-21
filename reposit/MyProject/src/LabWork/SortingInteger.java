package LabWork;

import java.util.Scanner;

public class SortingInteger {
	void getsorted(int ar[],int n)
	{
		/*
		an integer array, reverse the numbers in the array and
		returns the resulting array in sorted order
		*/
		int temp,rev = 0;
//		for(int i=0;i<n;i++)
//		{
//			temp=ar[i];
//			while(temp!=0)
//			{
//				rev = rev * 10;
//				rev = rev + temp%10;
//				temp = temp/10;
//			}
//			ar[i] = rev;
//			rev = 0;
//			
//
//		}
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
		System.out.print("Eneter elemnts of array  --> ");
		n = sc.nextInt();
		int ar[] = new int[n];
		for(int i=0;i<n;i++)
		{
			ar[i] = sc.nextInt();
		}
		SortingInteger ex = new SortingInteger();
		ex.getsorted(ar, n);
		sc.close();

	}

}
