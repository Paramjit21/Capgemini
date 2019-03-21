package MiniProjects;

class Race implements Runnable
{
	String tName;
	static int dis = 0;
	int flag = 1;
	public Race(String name) {
		// TODO Auto-generated constructor stub
		tName = name;
		
	}
		
	public void run() {
		Thread ct =  Thread.currentThread();
		ct.setName(tName);
		while(!ct.interrupted())
		{
			if(dis < 101)
			{
				if(tName.equals("Hare"))
				{
					System.out.println(tName + "  covered " + dis);					
					dis += 4; 
				}
				else
				{
					System.out.println(tName + "  covered "+ dis);
					dis += 2;
				}
				if(tName.equals("Hare") && flag == 1 && (dis > 50 || dis < 55))
				{
					try {
						flag = 2;
						System.out.println("Rabit feel sleep");
						Thread.sleep(1);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				if(dis > 100)
				{
					//HareTorRace.winner(ct);
					if(ct.getName().equals("Hare"))
					{
						System.out.println("Hare wins");
						System.exit(0);
					}
					if(ct.getName().equals("Tortoise"))
					{
						System.out.println("Tortoise wins");
						System.exit(0);
					}
					
				}
				
			}
		}
		
	}
}

public class HareTorRace {
	static Thread tortoise = new Thread(new Race("Tortoise"));
	static Thread hare = new Thread(new Race("Hare"));

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		
		hare.setPriority(10);
		hare.start();
		tortoise.start();
		
	}
/*	synchronized public static void winner(Thread th)
	{
		if(th.interrupted())
			return;
		if(th.getName().equals("Hare"))
		{
			System.out.println("Hare wins");
			tortoise.interrupt();
		}
		if(th.getName().equals("Tortoise"))
		{
			System.out.println("Tortoise wins");
			hare.interrupt();
		}
		
		
	}*/

}
