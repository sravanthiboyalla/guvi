import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class pro16pro
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		// your code goes here
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		int count=1;
		int count1=1;
		for(int i=0;i<n-1;i++)
		{
			if(a[i]>=a[i+1])
			{
				count=1;
				count1=count1+count;
			}
			else 
			{
				count++;
				count1=count1+count;
			}
			if(i==n-1)
			{
				if(a[a.length-2]>a[a.length-1])
				{
					count++;
					count1=count1+count;
				}
			}
		}
		System.out.println(count1);
	}
}
