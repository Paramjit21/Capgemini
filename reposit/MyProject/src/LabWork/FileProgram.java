package LabWork;


class Timer implements Runnable
{
	/*
	 * Get a timer and update in every 10 seconds
	 */
	
	public void run()
	{
		int i =0;
		System.out.println(i);
		while( i <100)
		{
			i++;
			if( i % 10 == 0)
			{
				
				try {
					Thread.sleep(1000);
					System.out.println(i);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}
}

public class FileProgram {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Timer cp = new Timer();
		Thread th = new Thread(cp);
		th.start();
		

	}

}

