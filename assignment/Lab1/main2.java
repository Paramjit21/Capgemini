import java.util.*;

/**
 *
 * @author Param
 *
 */

class Difference
{	
	int sum1,s3,sum2,diff;
	int calcDiff(int n)
	{
		int i;
		for(i=1;i<=n;i++)
		{
			sum1=sum1+(i*i);
			sum2=sum2+i;
		}
		s3=(sum2*sum2);
		if(s3>sum1)
		{
			diff=s3-sum1;
		}
		else
		{
			diff=sum1-s3;
		}
		return diff;			
		}
}
class Main2
{
	public static void main(String args[])
	{
		int nn;
		Scanner sc= new Scanner(System.in);
		nn=sc.nextInt();
		Difference d=new Difference();
		System.out.println("Difference is:"+d.calcDiff(nn));
	}
}		
