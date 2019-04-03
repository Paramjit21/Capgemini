package com;

import java.util.Calendar;
import java.util.Scanner;

/**
 * @author Param
 *
 */
public class Exercise66 {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Calendar c=Calendar.getInstance();
		//System.out.println(c.get(Calendar.MONTH)+1);
		System.out.println("Enter date in format DD-MM-YYYY");
		@SuppressWarnings("resource")
		String s=new Scanner(System.in).next();
		String []arr=s.split("\\-");
		if((Integer.parseInt(arr[2])-(c.get(Calendar.YEAR)))>0)
		{
			System.out.println("Invalid date");
		}
		else
		{
			System.out.println("Duration is");
			
			System.out.println("days: "+((c.get(Calendar.DATE))-Integer.parseInt(arr[0])));
			System.out.println("months: "+(Integer.parseInt(arr[1])-(c.get(Calendar.MONTH)+1)));
			System.out.println("year: "+((c.get(Calendar.YEAR))-Integer.parseInt(arr[2])));	
		}	
	}

}
