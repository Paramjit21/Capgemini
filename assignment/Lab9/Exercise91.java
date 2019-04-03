package com;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author Param
 *
 */
public class Exercise91 {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Runnable r=()->{System.out.println(Thread.currentThread().getName());};

		//Fixed Thread Pool
		ExecutorService ex=Executors.newFixedThreadPool(5);
		for(int i=0;i<10;i++) {
			ex.execute(r);
		}		

		//Single Thread Executor
		ExecutorService ex1=Executors.newSingleThreadExecutor();
		for(int i=0;i<10;i++) {
			ex1.execute(r);
		}
		
		//Cashed Thread Pool
		ExecutorService ex2=Executors.newCachedThreadPool();
		for(int i=0;i<10;i++) {
			ex2.execute(r);
		}

	}

}
