package com.capg.main;


import com.capg.bean.Employe;
import com.capg.service.Employeservice;
import com.capg.service.employeserviceint;

/*
 *
 * @author Param
 *
 */

public class Employemain {

	public static void main(String[] args) {
		employeserviceint eservice=new Employeservice();
		Employe emp=new Employe(50000);
		Employe emp1=new Employe(4000);
		System.out.println(eservice.check(emp));
		System.out.println(eservice.check(emp1));
}
}
