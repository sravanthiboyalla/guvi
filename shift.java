import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class shift
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n];
		int k=sc.nextInt();
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		if(n>k)
		{
			for(int i=n-k;i<n;i++)
			{
				System.out.print(a[i]+" ");
			}
			for(int i=0;i<k-1;i++)
			{
				if(i==k-2)
				{
					System.out.print(a[i]);
				}	
				else
				{
					System.out.print(a[i]+" ");
				}
			}
		}
		else
		{
			k=n%k;
			for(int i=n-k;i<n;i++)
			{
				System.out.print(a[i]+" ");
			}
			for(int i=0;i<k-1;i++)
			{
				if(i==k-2)
				{
					System.out.print(a[i]);
				}	
				else
				{
					System.out.println(a[i]+" ");
				}
			}
		}
	}
}
