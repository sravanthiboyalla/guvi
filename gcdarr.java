import java.util.Arrays;
import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class gcdarr
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
			Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n];
		int gcd=1;
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		Arrays.sort(a);
		int i,j;
		for(i=0;i<n;i++)
		{
			int count=0;
			for(j=n-1;j>=0;j--)
			{
				if(a[j]%a[i]==0)
				{
					count++;
				}
				if(count==n)
				{
					gcd=a[i];
				}
			}
		}
		System.out.println(gcd);
	}
}
