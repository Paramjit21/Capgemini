package main;

/**
 * @author Param
 */

import java.util.Scanner;

interface Factorial
{
	public int cal(int n);
}

public class Exercise105 {

	public int fact(int num)
	{
		int t=1;
		while(num>0)
		{
			t=t*num;
			num--;
		}
		return t;
	}
	public static void main(String ar[])
	{
		Factorial f=new Exercise105()::fact;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number");
		int n=sc.nextInt();
		System.out.println(f.cal(n));
	}
}
