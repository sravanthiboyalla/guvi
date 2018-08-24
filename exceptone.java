import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class exceptone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n];
		int count=0;
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		for(int i=0;i<n;i++)
		{
			if(a[i]%2==0)
			{
				count++;
			}
		}
		if(count==1)
		{
			for(int i=0;i<n;i++)
			{
				if(a[i]%2==0)
				{
					System.out.println(a[i]);
					break;
				}
			}
		}
		else
		{
			for(int i=0;i<n;i++)
			{
				if(a[i]%2==1)
				{
					System.out.println(a[i]);
					break;
				}
			}
		}
	}
}
