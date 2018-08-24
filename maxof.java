import java.util.*;
import java.lang.*;
import java.io.*;
class maxof
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
		for(int i=0;i<n-1;i++)
		{
			if(a[i]>a[i+1])
			{
				if(i==n-2)
				{
					System.out.print(a[i]);
				}
				else
				{
					System.out.print(a[i]+" ");
				}	
			}
			else
			{
				if(i==n-2)
				{
					System.out.print(a[i+1]);
				}
				else
				{
					System.out.print(a[i+1]+" ");
				}
			}
		}
	}
}
