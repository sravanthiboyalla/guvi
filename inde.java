import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class inde
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n];
		int count=0;
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		if(a[0]>a[1])
		{
			for(int i=0;i<n-1;i++)
			{
				if(i%2==0)
				{
					if(a[i]>a[i+1])
					{
						count++;
					}
					else
					{
						break;
					}
				}
				else
				{
					if(a[i]<a[i+1])
					{
						count++;
					}
					else
					{
						break;
					}
				}
			}
		}
		else
		{
			for(int i=0;i<n-1;i++)
			{
				if(i%2==0)
				{
					if(a[i]<a[i+1])
					{
						count++;
					}
					else
					{
						break;
					}
				}
				else
				{
					if(a[i]>a[i+1])
					{
						count++;
					}
					else
					{
						break;
					}
				}
			}
		}
		if(count==n-1)
		{
			System.out.println("yes");
		}
		else
		{
			System.out.println("no");
		}
	}
}
