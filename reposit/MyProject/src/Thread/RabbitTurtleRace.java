package Thread;

import java.util.concurrent.Executors;

import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class RabbitTurtleRace {
	/*
	 * working but not properly
	 */
	static int run = 0;
	static int tot = 0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("'+' is for turtle \t '*' is for Rabbit \n");
		System.out.println("*  +");
		ScheduledThreadPoolExecutor strt = 
				(ScheduledThreadPoolExecutor)Executors.newScheduledThreadPool(1);
		ScheduledThreadPoolExecutor medd = 
				(ScheduledThreadPoolExecutor)Executors.newScheduledThreadPool(1);
		ScheduledThreadPoolExecutor end = 
				(ScheduledThreadPoolExecutor)Executors.newScheduledThreadPool(1);
		Runnable start = ()-> {
			System.out.println("   T");
			run++;
			for(int i = 0;i<run;i++)
			{
				System.out.println();
			}
			System.out.println("R");				
		};
		Runnable med = ()-> {
			strt.shutdown();
			tot = run;
			System.out.println("   T");
		};
		Runnable finish = ()-> {
			medd.shutdown();
			System.out.println("R");
			run--;
			for(int i = tot;i>run;i--)
			{
				System.out.println();
			}
			System.out.println("   T");
			if(run == 0)
			{
				System.out.println("Turtle wins");
				end.shutdown();
			}
		};
		strt.scheduleAtFixedRate(start, 0, 1, TimeUnit.SECONDS);
		medd.scheduleAtFixedRate(med, 3,1,TimeUnit.SECONDS);
		end.scheduleAtFixedRate(finish, 5,1,TimeUnit.SECONDS);

	}

}
