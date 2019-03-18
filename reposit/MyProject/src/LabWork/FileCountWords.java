package LabWork;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/*
 *  program that displays the 
 *  number of characters, lines and words in a text
 */


public class FileCountWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int line = 1,wordCount = 0,charCount = 0;
		try
		{
			FileReader fr = new FileReader("/home/elena/eclipse-workspace/StringFileHandling/src/com/NewFile.txt");
			BufferedReader br = new BufferedReader(fr);
			String str =  "";
			while((str = br.readLine()) != null)
			{
				line += 1;
				String[] word = str.split(" ");
				wordCount += word.length;
				for(String s: word)
				{
					charCount += s.length();
				}
				
			}
		}
		catch (IOException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		System.out.println("Lines Count : "+ line);
		System.out.println("Word Count :" + wordCount);
		System.out.println("Charcter Count: " + charCount);

	}

}
