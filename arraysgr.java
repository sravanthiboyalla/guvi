import java.util.Arrays;
import java.util.*;
import java.lang.*;
import java.io.*;
class arraysgr
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int k=sc.nextInt();
		int a[]=new int[n];
		int count=0;
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		int j=0;
		Arrays.sort(a);
		for(int i=0;i<n;i++)
		{
			if(a[i]<=k)
			{
				j=i;
			}
		}
		System.out.println(a[j+1]);
	}
}
