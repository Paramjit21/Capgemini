package LabWork;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

	/* program that reads a line of integers and 
	 * then displays each integer and the sum of all integers
	*/

public class SumofInteger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input;
		List<Integer> c = new ArrayList<Integer>(); 
		System.out.println("Enter Integer: ");
		Scanner sc = new Scanner(System.in);
		input = sc.next();
		int intInput = Integer.valueOf(input);
		int sum = 0,temp;
		while(intInput > 0)
		{
			temp = intInput%10;
			c.add(temp);
			sum += temp;
			intInput = intInput/10;
		}
		sc.close();
		Collections.reverse(c);
		System.out.println("Sum is : " + sum );
		System.out.println("Integers are : "+c);
		

	}

}
