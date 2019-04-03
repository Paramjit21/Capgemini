package com;

import java.io.File;
import java.util.Scanner;

/**
 * @author Param
 *
 */

public class Exercise64 {
	public static void main(String ar[])
	{
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		File f=new File("D:\\Examples\\"+s);
		if(f.exists())
		{
			System.out.println("Yes file exists");
			if(f.canRead())
			{
				System.out.println("readable");
			}
			else
			{
				System.out.println("not readable");
			}
			if(f.canWrite())
			{
				System.out.println("writeable");
			}
			else
			{
				System.out.println("not writeable");
			}
			String []ss=f.getName().split("\\.");
			int n=ss.length;
			System.out.println("File Type -  "+ss[n-1]);
			System.out.println("Size of file- "+f.length()+" bytes");
		}
		else
		{
			System.out.println("doesn't exists");
		}
	}

}
