import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class equal
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=n/2;
		int l=c;
		int d=a+b;
		int count=0;
		if(n%2==0)
		{
			if(c%d==0)
			{
				System.out.println("YES");
			}
			else if(a>b)
			{
				int e=l/a;
				for(int i=1;i<=e;i++)
				{
					int s=e*i;
					int k=c-s;
					if(k%b==0)
					{
						count++;
						break;
					}
				}
			}
			else
			{
				int e=l/b;
				for(int i=1;i<=e;i++)
				{
					int s=e*i;
					int k=c-s;
					if(k%a==0)
					{
						count++;
						break;
					}
				}
			}
		}
		else
		{
			System.out.println("NO");
		}
		if(count>0)
		{
			System.out.println("YES");
		}
		else
		{
			System.out.println("NO");
		}
	}
}
