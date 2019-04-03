package com.capg.service;

/*
 *
 * @author Param
 *
 */

public class Employeservice implements employeserviceint {

	@Override
	public String check(double Salary) {
		if(Salary<5000)
		{
			return "No Scheme"; 
		}
		else if(Salary >5000 && Salary<20000)
		{
			return "Scheme C";
		}
		else if(Salary >=2000 && Salary<40000)
		{
			return "Scheme B";
		}
		else
		{
			return "scheme A";
		}
	}
}
