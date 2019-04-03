package com.bc.service;

import com.bc.bean.Customer;

public interface Bank {

	public String addCustomer(Customer c);
	public String login(String uname, String pass);
	
}
