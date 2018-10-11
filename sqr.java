import java.util.*;
import java.lang.*;
import java.io.*;
 
/* Name of the class has to be "Main" only if the class is public. */
class sqr
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int sqr=0;
		while(n>0)
		{
			int k=n%10;
			sqr=sqr+k*k;
			n=n/10;
		}
		System.out.println(sqr);
	}
}
