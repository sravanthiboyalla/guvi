import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class catalon
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		long n1,n2,a;
		long CatNumber;
		int cnt=1;
		if(n>=0&&n<=10)
		{
			for(a=1;a<=n;a++)
			{
				long factofa=1,factof2a=1;
				for(long i=1;i<=a;i++)
					factofa*=i;
				for(long i=1;i<=2*a;i++)
					factof2a*=i;
				CatNumber=factof2a/((factofa*factofa)*(a+1));
				if(a==n)
				{
					System.out.print(CatNumber);
				}
				else
				{
					System.out.print(CatNumber+" ");
				}
			}
		}
	}
}
