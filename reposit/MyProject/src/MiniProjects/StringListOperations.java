package MiniProjects;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class StringListOperations {
	/*
	 *	to perform the basic operations like insert, delete, display and search in list. List contains
	 *	String object items 
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean exit = true;
		int choice;
		String item;
		List<String> strList = new ArrayList<String>();
		Scanner sc = new Scanner(System.in);
		while(exit)
		{
			System.out.println("\n1. Insert");
			System.out.println("2. Search");
			System.out.println("3. Delete");
			System.out.println("4. Display");
			System.out.println("5. Exit");
			System.out.print("Enter your choice : ");
			choice = sc.nextInt();
			System.out.println();
			
			
			switch (choice) {
			case 1 :	System.out.print("Enter the item to be insterted : ");
						item = sc.next();
						strList.add(item);
						System.out.println("Item Inserted Successsfully");
						break;
						
			case 2 : 	System.out.print("Enter item to search : ");
						if(strList.isEmpty())
						{
							System.out.println("List is empty!!!");
							System.out.println("Enter items first");
						}
						else
						{					
							item =  sc.next();
							if(strList.contains(item))
								System.out.println("Item found in the list");
							else
								System.out.println("Item Not found in the List");
						}
						break;
						
			case 3 :	System.out.print("Enter item to delete: ");
						if(strList.isEmpty())
						{
							System.out.println("List is empty!!!");
							System.out.println("Enter items first");
						}
						else
						{					
							item =  sc.next();
							if(strList.contains(item))
							{
								strList.remove(item);
								System.out.println("Item Deleted successfully");								
							}
							else
								System.out.println("Item doesn't exsit in the List");
						}
						break;
						
			case 4 :	if(strList.isEmpty())
						{
							System.out.println("List is empty");
						}
						else
						{
							for(String str : strList)
										System.out.println(str);
						}
						break;
						
			case 5 :	exit = false;
						break;

			default:	System.out.println("Enter correct Choice!!!");
						break;
			}
			
		}
		System.out.println("Good Bye!! Have a Nice Day");
		sc.close();

	}

}
