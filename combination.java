import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class combination
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int k=sc.nextInt();
		int c=1;
		int d=1;
		for(int i=1;i<=k;i++)
		{
			c=c*n;
			n--;
			d=d*i;
		}
		int e=c/d;
		System.out.println(e);
	}
}
