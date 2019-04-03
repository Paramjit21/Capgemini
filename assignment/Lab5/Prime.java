package com;

/**
 *
 * @author Param
 *
 */

import java.util.*;
class Prime
{
	 public static void main(String[] args) {  
	       Scanner s = new Scanner(System.in);   
	       System.out.print("Enter the number : ");  
	       int end = s.nextInt();  
	       System.out.println("List of prime numbers "+ end);  
	       for (int i = 2; i <= end; i++) {  
	           if (isPrime(i)) {  
	               System.out.println(i); 
	           }  
	       }  
	   }  
	   public static boolean isPrime(int n) {  
	       if (n <= 1) {  
	           return false;  
	       }  
	       for (int i = 2; i <= Math.sqrt(n); i++) {  
	           if (n % i == 0) {  
	               return false;  
	           }  
	       }  
	       return true;  
	}  
}
			
