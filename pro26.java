import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class pro26
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n];
		int max=0;
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		for(int i=0;i<n;i++)
		{
			int count=0;
			for(int j=i+1;j<n;j++)
			{
				if(a[i]<=a[j])
				{
					count++;
					a[i]=a[j];
				}
				else
				{
					break;
				}
				if(count>max)
				{
					max=count;
				}
			}
		}
		System.out.println(max+1);
	}
}
