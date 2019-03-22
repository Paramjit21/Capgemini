package Thread;

class Race extends Thread
{
	int turSpeed = 1;
	int rabSpeed = 5;
	public void run()
	{
		
	}
}

public class CallableFuture {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
/*package MiniProjects;

import java.util.ArrayList;

class BrikWall extends Thread
{
	String name;
	private ArrayList<String> wall = new ArrayList<String>();	
	
	public BrikWall(String na) {
		// TODO Auto-generated constructor stub
		name = na;
	}
	public void run(){
		synchronized (wall) {
			wall.add(name);
			System.out.println(name);
			//wall.notify();
		}
	}
	public void displayWall()
	{
		int count = 0;
		for(String str : wall)
		{
			count ++;
			System.out.print(str + " ");
			if(count % 9 == 0)
			{
				System.out.println();
			}
		}
		System.out.println("\n"+count);
		
	}
		
}


public class BrickWall {

	public static void main(String[] args) {
	//TODO Auto-generated method stub
		
		BrikWall red = new BrikWall("RED");
		BrikWall black = new BrikWall("Black");
		red.start();
		black.start();
		for(int i = 0;i<50;i++)
		{
			red.run();
			black.run();
		}
		new BrikWall("").displayWall();
		}
}*/


