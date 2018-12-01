import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class onlyoneone
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
			int count1=0;
			for(int j=0;j<n;j++)
			{
				if(a[i]==a[j])
				{
					count1++;
				}
			}
			if(count1==1)
			{
				if(count==0)
				{
					System.out.print(a[i]);
					count++;
				}
				else
				{
					System.out.print(" "+a[i]);
					count++;
				}
			}
		}
	}
}
