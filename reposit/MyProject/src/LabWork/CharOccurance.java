package LabWork;

import java.util.Scanner;

public class CharOccurance {
	int count = 0;
	void count(String arr[],int n)
	{
		/*
		accepts a character array and
		count the number of times each character is present in the array.
		*/
		for(int i=0;i<n;i++)
		{
			for(int j=i+1;j<=n;j++)
			{
				if(arr[i].equals(arr[j]))
				{
					count = count++;
				}
			}
			System.out.println("Occurence of"+arr[i]+"is"+count);
			count = 0;
		}
	}
	public static void main(String ar[])
	{
		int n;
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		String c[] = new String[n];
		for(int i=0;i<n;i++)
		{
			c[i] = sc.next();
		}
		CharOccurance ex = new CharOccurance();
		ex.count(ar,n);
		sc.close();

	}
}
