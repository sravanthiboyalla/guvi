import java.util.Arrays;
import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class maxbox
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
		Arrays.sort(a);
		int count=1;
		for(int i=0;i<n-1;i++)
		{
			if(a[i]==a[i+1])
			{
				count++;
			}
		}
		System.out.println(count);
	}
}
