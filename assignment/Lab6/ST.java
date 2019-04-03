package com;

import java.util.StringTokenizer;

/**
 * @author Param
 *
 */

public class ST {

	public static void main(String[] args) {
		String s="10 54 38 97";
		int sum=0;
		StringTokenizer s1=new StringTokenizer(s);
		while(s1.hasMoreTokens())
		{
			int a=Integer.parseInt(s1.nextToken());
			System.out.println(a);
			sum+=a;
		}
		System.out.println("sum is : "+sum);
	}

}
