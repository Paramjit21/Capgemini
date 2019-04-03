package com.bc.pl;

import java.util.Scanner;

import com.bc.bean.Banking;
import com.bc.bean.Customer;
import com.bc.dao.TransactionImpl;
import com.bc.service.BankingImpl;

public class Main {

	static BankingImpl bank=new BankingImpl();
	static Banking transaction=null;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("******Welcome to HDFC Bank******");
		while(true) {
			System.out.println("1. Existing Customer");
			System.out.println("2. New Customer");
			System.out.println("3. Exit");
			int ch=sc.nextInt();
			switch(ch) {
			case 1:
				System.out.println("Enter Username: ");
				String uname=sc.next();
				System.out.println("Enter Password: ");
				String pass=sc.next();
				System.out.println(bank.login(uname, pass));
				break;
			case 2:
				System.out.println("Please provide Customer details..");
				System.out.println("Enter Name: ");
				String name=sc.next();
				System.out.println("Enter Age: ");
				int age=sc.nextInt();
				System.out.println("Enter Mobile number: ");
				long mobilenumber=sc.nextLong();
				System.out.println("Enter Email ID: ");
				String email=sc.next();
				System.out.println("Enter Username: ");
				String username=sc.next();
				System.out.println("Enter Password: ");
				String password=sc.next();
				System.out.println("Enter initial deposit: ");
				double amount=sc.nextDouble();
				String tid=TransactionImpl.gettid();
				while(true) {
					if(TransactionImpl.tids.contains(tid)) {
						tid=TransactionImpl.gettid();
					}
					else
						break;
				}
				transaction=new Banking(username, amount, amount, 0, tid);
				bank.initalTransaction(transaction);				
				
				System.out.println(bank.addCustomer(new Customer(name, username, password, age, mobilenumber, email,transaction)));
				break;
			case 3:
				sc.close();
				System.exit(0);
			}
		}
	}

}
