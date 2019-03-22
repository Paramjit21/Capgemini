package LabWork;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.StringTokenizer;

	/* program that reads a line of integers and 
	 * then displays each integer and the sum of all integers
	*/

public class SumofInteger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input;
		int sum = 0,temp;
		List<Integer> c = new ArrayList<Integer>(); // Integer Array List
		System.out.println("Enter Integer: ");
		Scanner sc = new Scanner(System.in);
		input = sc.nextLine();
	/*	int intInput = Integer.valueOf(input);
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
		System.out.println("Integers are : "+c); //Printing integers
		*/
		
		StringTokenizer stk =  new StringTokenizer(input);
		while(stk.hasMoreTokens())
		{
			int value = Integer.valueOf(stk.nextToken()); 
			System.out.println(value + " ");
			sum += value;
		}
		System.out.println("\nSum :" + sum);

	}

}
