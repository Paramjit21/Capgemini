package LabWork;

import java.util.Scanner;


public class fibonacci {
	public void fibFunction(int n)
	{
		// Print Fibonacci series
		int a=1;
		int b=1;
		int c;
		System.out.println("Non-Recursive method");
		if(n == 1)
		{
			System.out.println(a);
		}
		else
		{
			System.out.println(a);
			System.out.print(b + " ");
			for(int i=2;i<n;i++)
			{
				c=a+b;
				a=b;
				b=c;
				System.out.print(b + " ");
				if(i % 2 == 0)		// for pretty painting
					System.out.println();
			}
		}
	}

	public int fibRecurssion(int n) 
    { 
		// Prints nth element of fibonacci series
        if (n <= 1) 
            return n; 
        return fibRecurssion(n - 1) + fibRecurssion(n - 2); 
    } 
	public static void main(String[] args) {
		int n;
		Scanner sc = new Scanner(System.in);
        System.out.print("Enter value of n:");
        n = sc.nextInt();
        fibonacci fb=new fibonacci();
        fb.fibFunction(n);
        System.out.println("Recursive Method");
        System.out.println(fb.fibRecurssion(n));
        sc.close();
	}

}
