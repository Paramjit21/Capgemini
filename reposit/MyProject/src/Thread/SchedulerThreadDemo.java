package Thread;


import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class SchedulerThreadDemo {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ScheduledThreadPoolExecutor stpe = (ScheduledThreadPoolExecutor)Executors.newScheduledThreadPool(12);
		Runnable r = ()-> {
			System.out.println("Thread is running..");
		};
		Runnable r1 = ()-> {
			stpe.shutdown();
			System.out.println("\nKilling Thread..\nBye Have a Nice Time");
		};
		ScheduledFuture sf = stpe.scheduleAtFixedRate(r, 2, 1, TimeUnit.SECONDS);
		stpe.schedule(r1, 10,TimeUnit.SECONDS);
		
	}
}
