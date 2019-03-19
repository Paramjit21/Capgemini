package Thread;

import java.util.concurrent.Executors;

import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class RabbitTurtleRace {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int run =0;
		System.out.println("'+' is for turtle \t '*' is for Rabbit \n");
		System.out.println("*  +");
		ScheduledThreadPoolExecutor strt = 
				(ScheduledThreadPoolExecutor)Executors.newScheduledThreadPool(2);
		ScheduledThreadPoolExecutor med = 
				(ScheduledThreadPoolExecutor)Executors.newScheduledThreadPool(2);
		ScheduledThreadPoolExecutor end = 
				(ScheduledThreadPoolExecutor)Executors.newScheduledThreadPool(2);
		Runnable r = ()-> {
			System.out.println("*  +");
		};
		Runnable r1 = ()-> {
			strt.shutdown();
			System.out.println("   +");
		};
		Runnable r2 = ()-> {
			System.out.println("* ");
		};
		strt.scheduleAtFixedRate(r, 0, 1, TimeUnit.SECONDS);
		med.scheduleAtFixedRate(r1, 5,1,TimeUnit.SECONDS);

	}

}
