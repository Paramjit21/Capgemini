package com;

/**
 *
 * @author Param
 *
 */

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Verification {

	public static void main(String ar[])
	{
		String uname,pswrd;
		Map<String,String> mp=new HashMap<String,String>();
		mp.put("thesiddhantsingh21", "Beast");
		mp.put("param@123", "paramsingh");
		Scanner sc=new Scanner(System.in);
		uname=sc.next();
		pswrd=sc.next();
		
	/*	if((uname.contains("thesiddhantsingh21")) && pswrd.contains("Beast"))
		{
			System.out.println("User Logged in");
		}
		else
		{
			System.out.println("Wrong credentials");
		}*/
		if(mp.containsKey(uname))
		{
			if(mp.get(uname).equals(pswrd))
			{
				System.out.println("User Logged in");
			}
			else
			{
				System.out.println("Wrong Password");
			}
		}
		else
		{
			System.out.println("Wrong Username");
		}
	}
}
