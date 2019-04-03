package com.bc.bean;

public class Customer {

	private String name;
	private String uname;
	private String password;
	private int age;
	private long mobilenumber;
	private String email;
	private Banking transaction;

	public Banking getTransaction() {
		return transaction;
	}
	public void setTransaction(Banking transaction) {
		this.transaction = transaction;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getUname() {
		return uname;
	}
	public void setUname(String uname) {
		this.uname = uname;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public long getMobilenumber() {
		return mobilenumber;
	}
	public void setMobilenumber(long mobilenumber) {
		this.mobilenumber = mobilenumber;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Customer(String name, String uname, String password, int age, long mobilenumber, String email, Banking transaction) {
		super();
		this.name = name;
		this.uname = uname;
		this.password = password;
		this.age = age;
		this.mobilenumber = mobilenumber;
		this.email = email;
		this.transaction=transaction;
	}
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return 1;//getUname().length();
	}
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		if(this.getUname().equals(((Customer)obj).getUname()))
			return true;
		else
			return false;
	}
	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Customer Name: "+name+"\nUser name: "+uname+"\nMobile number: "+mobilenumber+"\nEmail ID: "+email;
	}



}
