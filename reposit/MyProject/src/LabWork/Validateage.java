package com;

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
		System.out.println("Age"+ age);
	    }
	}
	public static void main(String ar[])
	{
		Validateage ob=new Validateage();
		try
		{
			ob.setAge(10);
		}
		catch(Newexception e)
		{
			System.out.println("Invalid age");
		}
	}
	
}
