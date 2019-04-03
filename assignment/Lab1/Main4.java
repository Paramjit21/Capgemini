import java.util.*;

/**
 *
 * @author Param
 *
 */

class CheckNum
{
	boolean checkk(int n)
	{
		if(n==0)
		{
			return false;
		}
		else if(n==1)
		{
			return true;
		}
		else
		{
			while(n!=1)
			{
			     	if(n%2!=0)
				{
					return false;
				}
				n=n/2;
			}
			return true;
		}
	}	
}
class Main4
{
	public static void main(String args[])
	{
		int n;
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		CheckNum cc=new CheckNum();
		System.out.println(cc.checkk(n));
	}
}
