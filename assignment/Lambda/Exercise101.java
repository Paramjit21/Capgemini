package main;

/**
 * @author Param
 */

import java.util.Scanner;

interface Power
{
	double pwr(double a,double b);
}
public abstract class Exercise101 implements Power {

	public static void main(String[] args) {
	
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		Power p1=(x,y)->(Math.pow(x, y));
		System.out.println(p1.pwr(a,b));
	}
}


