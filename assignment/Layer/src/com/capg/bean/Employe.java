package com.capg.bean;

/*
 *
 * @author Param
 *
 */

public class Employe {
	private String designation;
	private String name;
	private double salary;
	public Employe()
	{
		
	}
	public Employe(String designation, String name, double salary) {
		super();
		this.designation = designation;
		this.name = name;
		this.salary = salary;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
