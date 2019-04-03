package com;

import java.util.Date;

/**
 * @author Param
 *
 */
public class TimeRefresher {

	@Override
	public void run() {
		
		while(true) {
			Date d=new Date();
			System.out.println(d);
			try {
				Thread.sleep(10000);
				
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TimeRefresher tr=new TimeRefresher();
		Thread t=new Thread((Runnable) tr);
		t.start();
	}
}
