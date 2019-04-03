package main;

/**
 * @author Param
 */

import java.util.Scanner;

interface Name
{
	public boolean verify();
}
public abstract class Exercise103 implements Name{

	public static void main(String ar[])
	{
		String uname="beast";
		String pass="1234@sid";
		Name a=()->{
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter username: ");
			String name=sc.next();
			System.out.println("Enter password: ");
			String pass1=sc.next();
			sc.close();
			if(name.equals(uname))
				if(pass1.equals(pass))
					return true;
				else
					return false;
			else
				return false;
		};
		System.out.println(a.verify());

	}
}
