package com.bc.service;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import com.bc.bean.Banking;
import com.bc.bean.Customer;
import com.bc.dao.Customers;
import com.bc.dao.TransactionImpl;

public class BankingImpl implements Bank {

	static Customers customer=new Customers();
	static TransactionImpl transaction=new TransactionImpl();
	static Map<String,String> accounts=new HashMap<String,String>();
	
	//Validation on Entered Data
	@Override
	public String addCustomer(Customer c) {
		// TODO Auto-generated method stub
		String name=c.getName();
		String uname=c.getUname();
		String password=c.getPassword();
		int age=c.getAge();
		long mobilenumber=c.getMobilenumber();
		if(name.length()<=0) {
			return "Enter Valid Name";
		}
		else if(accounts.containsKey(uname)) {
			 return "Username Exists!!!";
		}
		else if(password.length()<6) {
			return "Password length should be more than 6";
		}
		else if(age<18) {
			return "Kid..!! You are too young to have a bank account.\nCome back when you are 18.";
		}
		else if(mobilenumber<100000000L || mobilenumber>9999999999L) {
			return "Enter a valid mobile number.";
		}
		else {
			accounts.put(c.getUname(), c.getPassword());
			return customer.addCustomer(c);
		}
			
	}
	
	// Basic operations of Banking System
	@Override
	public String login(String uname, String pass) {
		// TODO Auto-generated method stub
		if(accounts.containsKey(uname)) {
			if(accounts.get(uname).equals(pass)) {
				System.out.println("Logged in Success fully.");
				int ch=0;
				while(true) {
					System.out.println("1. Personal details ");
					System.out.println("2. Show Balance ");
					System.out.println("3. Fund Transfer ");
					System.out.println("4. Deposit Money ");
					System.out.println("5. Withdraw Money ");
					System.out.println("6. Show Transaction history ");
					System.out.println("7. Log out ");
					System.out.println("Enter your Choice: ");
					
					@SuppressWarnings("resource")
					Scanner sc=new Scanner(System.in);
					ch=sc.nextInt();
					switch(ch) {
					case 1:	System.out.println(customer.getCustomer(uname));
							break;
					case 2: System.out.println(transaction.showbalance(uname));
							break;
					case 3:	System.out.print("Username of reciever: ");
							String targetuname=sc.next();
							System.out.println("Enter Amount to be transferred: ");
							double amount=sc.nextDouble();
							if((targetuname.equalsIgnoreCase(uname))) 
									System.out.println("Cannot Transfer to own Invalid choice!!!");
							else if(! accounts.containsKey(targetuname) )
									System.out.println("User doesn't exist!!!");
							else
								System.out.println(transaction.fundTransfer(uname, targetuname, amount));
							break;
					case 4: System.out.print("Enter amount to be deposit: ");
							double deposit=sc.nextDouble();
							System.out.println(transaction.credit(uname, deposit));
							break;
					case 5:	System.out.print("Enter Amount to withdraw : ");
							double withdraw=sc.nextDouble();
							System.out.println(transaction.debit(uname, withdraw));
							break;
					case 6:	transaction.getTransactionHistory(uname);
							break;
					case 7:	//sc.close();
							return "logged out Successfully!! Thank you for Choosing us.";
					}
				}	
			}
			else {
				return "Wrong password";
			}
		}
		else {
			return "User Doesn't Exist!!!";
		}
	}
	
	// For Opening Balance Transaction
	public void initalTransaction(Banking transaction2) {
		// TODO Auto-generated method stub
		transaction.transactionhistory.add(transaction2);
		
	}
	

}
