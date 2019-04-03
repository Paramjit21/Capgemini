package com;

/**
 *
 * @author Param
 *
 */

import java.util.Scanner;

public class fibonacci {
	public void firstfunction(int n)
	{
		int a=1;
		int b=1;
		int c;
		System.out.println(a);
		System.out.println(b);
		for(int i=2;i<n;i++)
		{
			c=a+b;
			a=b;
			b=c;
			System.out.println(b);
		}
	}

	public int secondfunction(int c)
	{
		 if ( c == 1 )
		      return 1;
		   else
		      return (secondfunction((c-1)+(c-2)));
	}
	public static void main(String[] args) {
		int n,c=1;
		Scanner sc = new Scanner(System.in);
        System.out.println("Enter value of n:");
        n = sc.nextInt();
        fibonacci fb=new fibonacci();
        fb.firstfunction(n);
        for(int i=1;i<=n;i++)
        {
        	System.out.println(fb.secondfunction(c));
        	c++;
        }
	}

}
