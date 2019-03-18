package LabWork;

import java.util.Date;
import java.util.Scanner;

public class DateDuration {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input;
		int i = 0;
		Scanner sc = new Scanner(System.in);
		while(i < 10)
		{
			i ++;
			System.out.print("Enter date'mm/dd/yyyy': ");
			input = sc.next();
			Date d = new Date();
			try
			{
				@SuppressWarnings("deprecation")
				long l = (long)Date.parse(input);
				Date newD = new Date(l); 
				System.out.println("-----------Duration --------");
				System.out.println("In Days --> "+ (d.getDate() - newD.getDate()));
				System.out.println("In Months -- >"+ (d.getMonth() - newD.getMonth()));
				System.out.println("In years --> " +(d.getYear() - newD.getYear()));
			}catch (Exception e) {
				// TODO: handle exception
				System.out.println("Enter date in format 'mm/dd/yyyy'");
			}
		}
		sc.close();
	}

}
