package Thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorDemo {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Runnable r = new Runnable() {
				@Override
				public void run()
				{
					System.out.println(Thread.currentThread().getName() + " is running...."); 
				}
		};
		ExecutorService ex = Executors.newFixedThreadPool(2);
		//ExecutorService exx = Executors.newFixedThreadPool(1);
		Executors exx;
		for(int i= 1; i <= 10; i++)
		{
			//ex.execute(r);	// output : pool-1-thread-5 is running...
			
		}
	}
}
