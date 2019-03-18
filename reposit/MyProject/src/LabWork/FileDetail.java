package LabWork;


import java.io.File;
import java.util.Scanner;

/*
	 *  reads on file name from the user, then 
	 *  displays information about whether the file exists, whether the file is readable, 
	 *  whether the file is writable, the type of file and the length of the file in bytes
	 */
public class FileDetail {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Eneter File Name: ");
		String fileName;
		fileName = sc.nextLine();
		try
		{
			File fr = new File(fileName);
			System.out.println("File Exists : "+fr.exists());
			System.out.println("File Readable : "+fr.canRead());
			System.out.println("File Writeable : "+fr.canWrite());
			System.out.println("File Length : "+fr.length() );
			
			
		}
		catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		sc.close();

	}

}
