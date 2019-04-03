package com;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * @author Param
 *
 */
public class Exercise62 {

	
	public static void main(String[] args) throws IOException {
		FileReader f=new FileReader("E:\\Examples\\java.txt");
		@SuppressWarnings("resource")
		BufferedReader br=new BufferedReader(f);
		int i=1;
		String str="";
		while((str=br.readLine()) != null)
		{
			System.out.println("Line "+i+" "+str);
			i++;
		}

	}
}
