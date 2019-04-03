import java.util.*;

/**
 *
 * @author Param
 *
 */

class Sum
{
	int sum;
	int calculatesum(int n)
	{
		int i;
		for(i=0;i<=n;i++)
		{
			if(i%3==0 || i%5==0)
			{
				sum=sum+i;
			}
		}
		return sum;
	}
}
class Main
{
	public static void main(String args[])
	{
		int nn;
		Scanner sc= new Scanner(System.in);
		nn=sc.nextInt();
		Sum s=new Sum();
		System.out.println("Sum is"+s.calculatesum(nn));
	}
}
		
		
		
		
