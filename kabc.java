import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class kabc
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
		int count=0;
		for(int i=0;i<n;i++)
		{
			if(a[i]==i)
			{
				count++;
				if(count==1)
				{
					System.out.print(i);
				}
				else
				{
					System.out.print(" "+i);
				}
			}
		}
		int d=-1;
		if(count==0)
		{
			System.out.print(d);	
		}
	}
}
