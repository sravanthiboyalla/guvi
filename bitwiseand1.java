import java.util.ArrayList;
import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class bitwiseand1
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
		ArrayList<Integer> b=new ArrayList<Integer>();
		for(int i=0;i<n;i++)
		{
			for(int j=i;j<n;j++)
			{
				int x=a[i]&a[j];
				b.add(x);
			}
		}
		System.out.println(Collections.max(b));
	}
}
