import java.util.Arrays;
import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class arrsort
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
		Arrays.sort(a);
		if(n%2==0)
		{
			for(int i=0;i<n/2;i++)
			{
				if(i==n-1)
				{
					System.out.print(a[n-i-1]+" "+a[i]);
				}
				else
				{
					System.out.print(a[n-i-1]+" "+a[i]+" ");
				}
			}
		}
		else
		{
			for(int i=0;i<n/2+1;i++)
			{
				if(i==n/2)
				{
					System.out.print(a[i]);
				}
				else
				{
					System.out.print(a[n-i-1]+" "+a[i]+" ");
				}
			}	
		}
	}
}
