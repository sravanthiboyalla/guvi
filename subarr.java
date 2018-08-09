import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class subarr
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
		int max1=0;
		int maxend=0;
		for(int i=0;i<n;i++)
		{
			maxend=maxend+a[i];
			maxend=Integer.max(maxend,0);
			max1=Integer.max(max1,maxend);
		}
		System.out.println(max1);
	}
}
