import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class indexdiff
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		int min=a[0];
		int min1=0;
		for(int i=0;i<n;i++)
		{
			if(min>a[i])
			{
				min1=i;	
			}
		}
		int max=a[0];
		int max1=0;
		for(int i=0;i<n;i++)
		{
			if(max<a[i])
			{
				max1=i;
			}
		}
		if(max1>min1)
		{
			System.out.println(max1-min1);
		}
		else
		{
			System.out.println(min1-max1);
		}
	}
}
