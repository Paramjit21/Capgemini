package Thread;


class Calculator extends Thread
{
	int total;
	public void run()
	{
		for(int i = 0;i <= 1000; i++)
		{
			total += 1;
		} 
		notify();
		// used to tell thread that wait for exceution till i am executing
	}
}


public class TestThread {
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculator cal = new Calculator();
		cal.start();
		System.out.println(cal.total);

	}

}
