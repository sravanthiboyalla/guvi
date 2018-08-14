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
		for(int i=0;i<k;i++)
		{
			int temp=a[0];
			for(int j=0;j<n;j++)
			{
				if(j==n-1)
				{
					a[j]=temp;
				}
				else
				{
					a[j]=a[j+1];
				}
			}
		}
		for(int j=0;j<n;j++)
		{
			if(j==n-1)
			{
				System.out.print(a[j]);
			}
			else
			{
				System.out.print(a[j]+" ");
			}
		}
	}
}
