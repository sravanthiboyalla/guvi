import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class arrm
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n];
		int k=sc.nextInt();
		int count=0;
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		int max=a[0];
		for(int i=0;i<n;i++)
		{
			if(a[i]==k)
			{
				count++;
			}
			else
			{
				if(a[i]<k)
				{
					max=a[i];
				}
			}
		}
		if(count==1)
		{
			System.out.println(k);
		}
		else
		{
			System.out.println(max);
		}
	}
}
