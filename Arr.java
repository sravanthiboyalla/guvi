import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Arr
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int k=sc.nextInt();
		int sum=0;
		int i;
		for(i=1;i<=n;i++)
		{
			System.out.println(i);	
		}
		for(i=1;i<=k;i++)
		{
			sum=sum+i;
		}
		System.out.println(sum);
	}
}
