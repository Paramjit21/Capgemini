package LabWork;

import java.util.Scanner;

		/*
		 * Program to validate the full name of an employee. Create and 
		 * throw a user defined exception if firstName and lastName is blank
		 */

@SuppressWarnings("serial")
class MyException extends Exception
{
	public String printmessage()
	{
		return "\nInvalid Name";
	}
}
public class Validateemp {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter First and Last name : ");
		String str[] = sc.nextLine().split(" ");
		sc.close();
		//System.out.println("Len"+str.length+" "+str[0]);
		Validateemp ve=new Validateemp();
		try
		{
			if(str.length == 1)		// check wheather user entered first and last name
				throw new MyException();				
			ve.setname(str[0],str[1]);
		}
		catch (MyException e) {

			System.out.println(e.printmessage());
		}
		sc.close();
	}
	void setname(String fname,String lname) throws MyException
	{
		System.out.println("\nName : "+fname+" "+lname);
	 
	}

}
