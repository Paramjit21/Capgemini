package com;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

/**
 * @author Param
 *
 */

public class FileProgram {

	public static void main(String[] args) throws FileNotFoundException {
		FileInputStream fis=new FileInputStream("E:\\Examples\\source.txt");
		FileOutputStream fos = new FileOutputStream("E:\\Examples\\target.txt");
		CopyDataThread c=new CopyDataThread(fis,fos);
		c.start();
	}
}
