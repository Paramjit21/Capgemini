package Thread;



public class TestConcurancy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Runnable r = new Runnable() {
				@Override
				public void run()
				{
					System.out.println(Thread.currentThread().getName() + " is running...."); 
				}
		};
		for(int i= 1; i <= 20; i++)
		{
			Thread t = new Thread(r);
			t.start();
		}

	}

}
