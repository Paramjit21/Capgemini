package main;

/**
 * @author Param
 */

import java.util.Scanner;

interface Split
{
	public String splt(String s);
}
public abstract class Exercise102 implements Split{

	public static void main(String[] args) {
		
		String input="";
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a String: ");
		input=sc.next();
		Split ss=(se)->{
			String  result="";
			String[] s=se.split("");
			String a=" ";
			for(int i=0;i<s.length;i++) {
				result+=s[i]+a;
			}
			return result;
		};
		System.out.println(ss.splt(input));
}
}
