package com;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;


public class MapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String, String> m =  new LinkedHashMap<String, String>();
		m.put("Amit","xyz");
		m.put("Vishal","yyz");
		m.put("Modi","xzz");
		m.put("Sodi","xxz");
		// Something like Login Portal
		// to check wheather user enterd right paswrd and username
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Username");
		String uname = sc.next();
		if(m.containsKey(uname))
		{
			System.out.println("Enter Password");
			String pswrd = sc.next();
			if(m.get(uname).equals(pswrd))
			{
				System.out.println("Welcome");
				
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
		sc.close();
		

	}

}
