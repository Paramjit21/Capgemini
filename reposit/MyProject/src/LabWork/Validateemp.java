package com;

import java.util.Scanner;
@SuppressWarnings("serial")
class MyException extends Exception
{
	public String printmessage()
	{
		return "invalid name";
	}
}
public class Validateemp {

	public static void main(String[] args) {

		Validateemp ve=new Validateemp();
		try
		{
			ve.setname("Paramjit","Singh");
		}
		catch (Exception e) {

			System.out.println("Enter Valid name");
		}
	}
	void setname(String fname,String lname) throws MyException
	{
		if(fname.equals("")|| lname.equals(""))
		{
			throw new MyException();
		}
		else
		{
		System.out.println("Name="+fname+""+lname);
	    }
	}

}
