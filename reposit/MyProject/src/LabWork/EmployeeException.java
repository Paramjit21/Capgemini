package LabWork;

class NewException extends Exception
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public String printmessage()
	{
		return "Invalid Age";	
	}
}
public class EmployeeException {

	public void setSalary(int salary)throws NewException
	{
		if(salary<3000)
		{
		throw new NewException();
		}
		else
		{
		System.out.println("Salary"+ salary);
	    }
	}
	public static void main(String[] args) {
		EmployeeException ob=new EmployeeException();
		try
		{
			ob.setSalary(1000);
		}
		catch(NewException e)
		{
			System.out.println("Invalid age");
		}
		

	}

}
