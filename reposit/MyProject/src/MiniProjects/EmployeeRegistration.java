package MiniProjects;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EmployeeRegistration {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Variable Declaration
		List<String> firstName = new ArrayList<String>();
		List<String> LastName = new ArrayList<String>();
		List<String> mobileNumber = new ArrayList<String>();
		List<String> email = new ArrayList<String>();
		List<String> address = new ArrayList<String>();
		int empCount;
		//Scanner
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of Employees");
		empCount =  sc.nextInt();
		sc.nextLine();
		
		// Getting detail of Employees
		for(int i = 0; i< empCount; i++)
		{
			System.out.println("Enter Employee " + (i+1)+" Details:");
			System.out.print("\nEnter First Name : ");
			firstName.add(sc.nextLine());
			System.out.print("Enter Lastname : ");
			LastName.add(sc.nextLine());
			System.out.print("Enter Mobile no. :");
			mobileNumber.add(sc.nextLine());
			System.out.print("Enter the Email : ");
			email.add(sc.nextLine());
			System.out.print("Enter the Adress");
			address.add(sc.nextLine());
		}
		sc.close();
		
		// Displaying Employee Detail
		System.out.println("\n\n Employee List: \n");
		System.out.format("%-15s %-15s %-15s %-18s %-15s\n","Firstname","Lastname","Mobile","Email","Address");
		
		
		for(int i = 0; i < empCount; i++)
		{
			System.out.format("%-15s %-15s %-15s %-18s %-15s\n",firstName.get(i),
					LastName.get(i),mobileNumber.get(i),email.get(i),address.get(i));
		}

	}

}
