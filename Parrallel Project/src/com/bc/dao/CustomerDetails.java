package com.bc.dao;

import com.bc.bean.Customer;

//Customer Interface for adding and getting customer details

public interface CustomerDetails {

	public String addCustomer(Customer c);
	public Customer getCustomer(String uname);
	
}
