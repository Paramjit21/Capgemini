package com.bc.dao;

import java.util.ArrayList;
import java.util.List;

import com.bc.bean.Banking;
import com.bc.bean.Customer;

public class Customers implements CustomerDetails {

	public static List<Customer> customers=new ArrayList<Customer>();
	public static List<Banking> transactionhistory=new ArrayList<Banking>();
	@Override
	public String addCustomer(Customer c) {
		// TODO Auto-generated method stub
		customers.add(c);
		return "Customer added Successfully..";
	}

	@Override
	public Customer getCustomer(String uname) {
		// TODO Auto-generated method stub
		int flag=0;
		Customer c=null;
		for(Customer i:customers) {
			if(i.getUname().equals(uname)) {
				c=i;
			}
			flag++;
		}
		if(flag != 0)
			return c;
		else
			return null;
	}

}
