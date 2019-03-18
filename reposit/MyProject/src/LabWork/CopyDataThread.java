package LabWork;

import java.io.FileInputStream;
import java.io.FileWriter;

public class CopyDataThread extends Thread {
	
	/*
	 * Copy data from one file to another file and after copying 10 character
	 * pause of 10 seconds 
	 */
	public void run()
	{
		try
		{
			FileInputStream fr = new FileInputStream("/home/elena/eclipse-workspace/StringFileHandling/src/com/NewFile.txt");
			FileWriter fos = new FileWriter("/home/elena/eclipse-workspace/StringFileHandling/src/com/target.txt");
			char ch ;
			int i = 0;
			while(fr.available() > 0)
			{
				ch = (char)fr.read();
				if(ch == ' ' || ch == '\n')
				{
					continue;
				}
				System.out.print(ch);
				i += 1;					
				if(i%10 == 0)
				{
					System.out.println("\nTen character entered!!\n");
					Thread.sleep(5000);
				}
				fos.write(ch);
			}
			System.out.println("Total number of characters -->" + i);
			fos.flush();
			fos.close();
			fr.close();
		}
		catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CopyDataThread cp = new CopyDataThread();
		cp.start();
		

	}

}
