import java.util.*;
import java.lang.*;
import java.io.*;
 
/* Name of the class has to be "Main" only if the class is public. */
class sortarr
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
		for(int i=0;i<n-1;i++)
		{
			if(a[i]<a[i+1])
			{
				count++;
			}
		}
		if(n==(count+1))
		{
			System.out.println("yes");
		}
		else
		{
			System.out.println("no");
		}
	}
}
