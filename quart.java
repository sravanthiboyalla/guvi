import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class quart
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int k=0;
		while(n>0)
		{
			int d=n%10;
			k=k+d*d*d*d;
			n=n/10;
		}
		System.out.println(k);
	}
}
