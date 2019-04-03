package com;

import java.util.Scanner;

/**
 * @author Param
 *
 */

public class Exercise67 {

	public boolean validation(String s)
	{
		String []arr=s.split("\\");
		if(!(arr[arr.length-1].equals("job")))
		{
			return false;
		}
		else
		{
			if((s.length()-4)<8)
			{
				return false;
			}
			else
			{
				return true;
			}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@SuppressWarnings("resource")
		String s=new Scanner(System.in).next();
		Exercise67 l=new Exercise67();
		boolean b=l.validation(s);
		if(b)
		{
			System.out.println("Passed");
		}
		else
		{
			System.out.println("Failed");
		}

	}

}
