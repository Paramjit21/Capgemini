package com;

import java.util.Scanner;

public class SumofCubes {

	public void cube(int n)
	{
		/*
		* 	Sum of the cubes of the digits of an n digit number
		*/
		int r,s = 0;
		while(n != 0)
		{
			r = n%10;
			n = n/10;
			s = (int)(s+(Math.pow(r,3)));
		}
		System.out.println(s);
	}
	public static void main(String ar[])
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		SumofCubes ex = new SumofCubes();
		ex4.cube(n);
	}
}
