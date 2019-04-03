package com;

/**
 *
 * @author Param
 *
 */

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
		
		/*String fname;
		String lname;
		Scanner sc=new Scanner(System.in);
		fname=sc.next();
		lname=sc.next();*/
		Validateemp ve=new Validateemp();
		try
		{
			ve.setname("Siddhant","Shekhar");
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
