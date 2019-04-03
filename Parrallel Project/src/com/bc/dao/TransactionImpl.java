package com.bc.dao;

import java.util.ArrayList;
import java.util.List;

import com.bc.bean.Banking;
import com.bc.bean.Customer;

public class TransactionImpl extends Customers implements Transaction {

	public static List<String> tids=new ArrayList<String>();
	@Override
	public String credit(String uname,double amount) {
		// TODO Auto-generated method stub
		for(Customer c:customers) {
			if(c.getUname().equals(uname)) {
				double money=c.getTransaction().getTotalamount()+amount;
				c.getTransaction().setTotalamount(money);
				String s=gettid();
				
				//generating unique transaction id
				while(true) {
					if(tids.contains(s)) {
						s=gettid();
					}
					else
						tids.add(s);
						break;
				}
				
				String tid=s;
				Banking t=new Banking(uname,c.getTransaction().getTotalamount(),amount,0,tid);
				transactionhistory.add(t);
			}
		}
		return amount+" Credited Successfully.";
	}

	@Override
	public String debit(String uname,double amount) {
		// TODO Auto-generated method stub
		for(Customer c:customers) {
			if(c.getUname().equals(uname)) {
				if(amount>c.getTransaction().getTotalamount()) {
					System.out.println("No Sufficient Balance");
				}
				else {
					double money=c.getTransaction().getTotalamount()-amount;
					c.getTransaction().setTotalamount(money);
					String s=gettid();
					
					//generating unique transaction id
					while(true) {
						if(tids.contains(s)) {
							s=gettid();
						}
						else
							tids.add(s);
							break;
					}
					String tid=s;
					Banking t=new Banking(uname,c.getTransaction().getTotalamount(),0,amount,tid);
					transactionhistory.add(t);
				}
			}
		}
		return amount+" Debitted successfully.";
	}
	
	//generating random alphanumeric string for transaction id.
	public static String gettid() 
    {  
        String AlphaNumericString = "ABCDEFGHIJKLMNOPQRSTUVWXYZ" + "0123456789" + "abcdefghijklmnopqrstuvxyz"; 	       
        StringBuilder sb = new StringBuilder(10); 
  
        for (int i = 0; i < 10; i++) { 
            int index = (int)(AlphaNumericString.length()* Math.random()); 
           // System.out.println("index" +index);
            sb.append(AlphaNumericString.charAt(index)); 
           //System.out.println(sb);
        } 
        return sb.toString(); 
    }


	@Override
	public String showbalance(String uname) {
		
		String str = null;
		for(Customer c:customers) {
			if(c.getName().equalsIgnoreCase(uname)) {
				System.out.println(c.getName());
				str= "Available balance is: "+c.getTransaction().getTotalamount();
			}
		}
		return str;
		
//		customers.forEach((c) -> {if(c.getName().equalsIgnoreCase(uname))
//			System.out.println(c.getTransaction().getTotalamount()); });
//		return " ";
	}

	@Override
	public String fundTransfer(String sourceuname, String targetuname, double amount) {
		// TODO Auto-generated method stub
		debit(sourceuname,amount);
		credit(targetuname,amount);
		return "Fund Transfer successful.";
	}

	@Override
	public void getTransactionHistory(String uname) {
		// TODO Auto-generated method stub
		System.out.println("Transaction ID:\t\tCredit:\t\tDebit:\t\tTotal Amount:");
		for(Banking i:transactionhistory) {
			if(i.getUname().equals(uname)) {
				System.out.println(i);
			}
		}
	}

	
	
	
}
