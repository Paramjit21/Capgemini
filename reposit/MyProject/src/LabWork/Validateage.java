package LabWork;

import java.util.Scanner;

@SuppressWarnings("serial")
class Newexception extends Exception
{
	public String printmessage()
	{
		return "Invalid Age";	
	}
}
public class Validateage {

	public void setAge(int age)throws Newexception
	{
		if(age<15)
		{
		throw new Newexception();
		}
		else
		{
		System.out.println("Age : "+ age);
	    }
	}
	public static void main(String ar[])
	{
		Validateage ob=new Validateage();
		Scanner sc = new Scanner(System.in);
		int age;
		System.out.print("Enter age : ");
		age = sc.nextInt();
		try
		{
			ob.setAge(age);
		}
		catch(Newexception e)
		{
			System.out.println("Invalid age");
		}
		sc.close();
	}
	
}
