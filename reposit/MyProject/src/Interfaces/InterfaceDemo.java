package Interfaces;

import java.util.function.BiFunction;
import java.util.function.Consumer;

class Ab
{
	public Ab() {
		System.out.println("\nconstructor Running");
	}
	
	public static void display()
	{
		System.out.println("\n"+"Static Method Refrence Running");
	}
	
	public void disp()
	{
		System.out.println("Method Refrence Running");
	}
	
	public int sum(int a,int b) {
		return a+b;
	}
}



public class InterfaceDemo implements MyInterface{

	@Override
	public int printValue(int n) {
		// TODO Auto-generated method stub
		return n;
	}
	public static void main(String[] args) {
		InterfaceDemo i = new InterfaceDemo(); // class object
		
		i.printValue(10);
		
		
		MyInterface.staicMethod(); // Static method only called by the 
								   // interfaeName.staticMethodName
		
		
		MyInterface lam = (n) -> {
		System.out.println("Hello");return n;}; // Lambda Expression
		System.out.println(lam.printValue(20)+"\n");
		
		
		Consumer<String> cons = (String str) ->  System.out.println(str);
		Consumer<String> con =  System.out::println;
		System.out.println(cons);
		System.out.println(con +"\n");
		
		// Method Reference using thread
		Thread t = new Thread(Ab::new);
		Thread t1 = new Thread(new Ab()::disp);
		Thread t2 = new Thread(Ab::display);
		t.start();
		t1.start();
		t2.start();
		
		
		// Method Reference using syso
		BiFunction<Integer, Integer, Integer> b = new Ab()::sum;
		System.out.println("\nBiFunction Interface -->"+b.apply(5,6));
		
	}
	

}
