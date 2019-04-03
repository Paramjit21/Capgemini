package com;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author Param
 *
 */

public class Exercise63 {

	public static void main(String[] args) throws IOException {
		
		File f=new File("D:\\Examples\\java.txt");
		FileInputStream fi=new FileInputStream(f);
		InputStreamReader isr=new InputStreamReader(fi);
		@SuppressWarnings("resource")
		BufferedReader reader=new BufferedReader(isr);
		String line;
		int cw=0;
		int cl=0;
		int cc=0;
		while((line=reader.readLine())!=null)
		{
			if(!(line.equals("")))
			{
				cc+=line.length();
				String []s=line.split("\\s+");
				cw+=s.length;
			}
			cl++;
		}
		System.out.println("Word == "+cw);
		System.out.println("Character == "+cc);
		System.out.println("Line == "+cl);
	
	}

}
