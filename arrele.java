import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class arrele
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
		int sum=0;
		for(int i=0;i<n;i++)
		{
			if(a[i]%2==0)
			{
				sum=sum+a[i];
				if(i==n-1)
				{
					System.out.println(sum);
				}
				else
				{
					System.out.println(sum+" ");
				}
			}
			else
			{
				if(i==n-1)
				{
					System.out.println(a[i]);
				}
				else
				{
					System.out.println(a[i]+" ");
				}
			}
		}
	}
}
