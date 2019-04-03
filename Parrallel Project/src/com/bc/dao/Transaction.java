package com.bc.dao;

public interface Transaction {

	public String credit(String uname,double amount);
	public String debit(String uname,double amount);
	public String showbalance(String uname);
	public String fundTransfer(String sourceuname, String targetuname, double amount);
	public void getTransactionHistory(String uname);
	
}
