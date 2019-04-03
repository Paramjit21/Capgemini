package com.bc.bean;

public class Banking {

	private String uname;
	private double totalamount;
	private double credit;
	private double debit;
	private String transactionid;
	public double getTotalamount() {
		return totalamount;
	}
	public void setTotalamount(double totalamount) {
		this.totalamount = totalamount;
	}
	public double getCredit() {
		return credit;
	}
	public void setCredit(double credit) {
		this.credit = credit;
	}
	public double getDebit() {
		return debit;
	}
	public void setDebit(double debit) {
		this.debit = debit;
	}
	public String getTransactionid() {
		return transactionid;
	}
	public void setTransactionid(String transactionid) {
		this.transactionid = transactionid;
	}
	public String getUname() {
		return uname;
	}
	public void setUname(String uname) {
		this.uname = uname;
	}
	public Banking(String uname, double totalamount, double credit, double debit, String transactionid) {
		super();
		this.uname=uname;
		this.totalamount = totalamount;
		this.credit = credit;
		this.debit = debit;
		this.transactionid = transactionid;
	}
	public Banking() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return transactionid+"\t\t"+credit+"\t\t"+debit+"\t\t"+totalamount;
	}
	
	
}
