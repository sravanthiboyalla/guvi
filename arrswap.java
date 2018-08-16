import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class arrswap
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
		if(n%2==0)
		{
			for(int i=0;i<n-1;i=i+2)
			{
				int temp=a[i];
				a[i]=a[i+1];
				a[i+1]=temp;
			}
		}
		else
		{
			for(int i=0;i<n-2;i=i+2)
			{
				int temp=a[i];
				a[i]=a[i+1];
				a[i+1]=temp;
			}
		}
		for(int i=0;i<n;i++)
		{
			if(i==n-1)
			{
				System.out.print(a[i]);
			}
			else
			{
				System.out.print(a[i]+" ");
			}
		}	
	}
}
