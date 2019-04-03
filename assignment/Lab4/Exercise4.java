package com;

/**
 *
 * @author Param
 *
 */

import java.util.Scanner;

public class Exercise4 {

	public void cube(int n)
	{
		int r,s=0;
		while(n!=0)
		{
			r=n%10;
			n=n/10;
			s=(int)(s+(Math.pow(r,3)));
			//System.out.println(s);
		}
		System.out.println(s);
	}
	public static void main(String ar[]) 
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		Exercise4 ex4=new Exercise4();
		ex4.cube(n);
	}
}
