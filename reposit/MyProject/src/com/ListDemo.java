package com;

import java.util.ArrayList;
import java.util.List;

import boss.Employee;
public class ListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Employee> li = new ArrayList<Employee>();
		li.add(new Employee(1001, "Ansh", 582330));
		li.add(new Employee(1002, "Manoj", 5826312));
		for(Employee e : li)
		{
			System.out.println(e);
		}
		
				

	}

}
