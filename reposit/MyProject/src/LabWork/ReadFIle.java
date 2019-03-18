package LabWork;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

	/*
	 reads a file and displays the file on the screen, 
	  with a line number before each line
	 */

public class ReadFIle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
			FileReader fr = new FileReader("/home/elena/eclipse-workspace/StringFileHandling/src/com/NewFile.txt");
			BufferedReader br = new BufferedReader(fr);
			String str =  "";
			int line = 1;
			while((str = br.readLine()) != null)
			{
				System.out.print(line + " : ");
				System.out.println(str);
				line += 1;
			}
		}
		catch (IOException e) {
			// TODO: handle exception
			e.printStackTrace();
		}


	}

}
