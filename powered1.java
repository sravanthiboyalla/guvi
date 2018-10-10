import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class powered1
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int k=n;
		int count=0;
		while(n>0)
		{
			n=n/10;
			count++;
		}
		int pow1=0;
		int k1=0;
		while(k>0)
		{
			k1=k%10;
			pow1=pow1+(int)Math.pow(k1,count-1);
			count--;
			k=k/10;
		}
		System.out.println(pow1);
	}
}
