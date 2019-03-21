package LabWork;

import java.util.Scanner;

public class CharOccurance {
	int count = 0;
	void count(char arr[],int n)
	{
		/*
		accepts a character array and
		count the number of times each character is present in the array.
		*/
		int count[] = new int[256],find = 0;
		for(char a : arr)
		{
			count[a]++;
		}
		char ch[] = new char[n];
		for(int i=0;i<n;i++)
		{
			find = 0;
			ch[i] = arr[i];
			for(int j=0;j<=i;j++)
			{
				//System.out.println(arr[i] + " " +ch[j]);
				if(arr[i] ==  ch[j])
				{
					find++;
				}
			}
			if(find == 1)
			{
				System.out.println("Occurence of "+arr[i]+" is "+count[arr[i]]);
			}
		
		}
	}
	public static void main(String ar[])
	{
		String str;
		int len;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter String:");
		str = sc.next();
		len = str.length();
		char c[] = new char[len] ;
		for(int i=0;i<len;i++)
		{
			c[i] = (char) str.charAt(i);
		}
		CharOccurance ex = new CharOccurance();
		ex.count(c,len);
		sc.close();

	}
}
